package projet_java;
//classe du joueur
public class Champion {
    private String nom;
    private int id;
    private int statVie;
    private SpecialAbility pouvoir;
    private List<MonstreInterface> monstres;
    private boolean isUtilisee = false;

    public Champion(String nom, int id, int statVie, SpecialAbility pouvoir) {
        this.nom = nom;
        this.id = id;
        this.statVie = statVie;
        this.specialAbility = pouvoir;
        this.monstres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatVie() {
        return statVie;
    }

    public void setStatVie(int statVie) {
        this.statVie = statVie;
    }

    public SpecialAbility getSpecialAbility() {
        return pouvoir;
    }

    public void setSpecialAbility(SpecialAbility pouvoir) {
        this.pouvoir = pouvoir;
    }

    public List<MonstreInterface> getMonstres() {
        return monstres;
    }

    public void setMonstres(List<MonstreInterface> monstres) {
        this.monstres = monstres;
    }

    public void addMonstre(MonstreInterface monstre) {
        monstres.add(monstre);
    }

    public void removeMonstre(MonstreInterface monstre) {
        monstres.remove(monstre);
    }

    public MonstreInterface choixMonstreAjouer() {
        System.out.println("Votre main :");
        for (int i = 0; i < main.size(); i++) {
            System.out.println((i + 1) + ". " + main.get(i).getNom() + " (" + main.get(i).getStatAttaque() + "/" + main.get(i).getStatVie() + ")");
        }
            Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le numéro du monstre que vous voulez jouer : ");
        int choix = scanner.nextInt();
    
        if (choix < 1 || choix > main.size()) {
            System.out.println("Choix invalide.");
            return null;
        }
    
        // Retourner le monstre sélectionné
        return main.remove(choix - 1);
    }

    public boolean capaciteSpeciale() {
        if (!specialAbilityAvailable) {
            System.out.println("Votre capacité spéciale n'est pas disponible.");
            return false;
        }
    
        // Utiliser la capacité spéciale
        System.out.println("Vous utilisez votre capacité spéciale : " + specialAbilityName + " !");
        // Ici, vous pouvez ajouter le code qui implémente l'effet de la capacité spéciale
    
        // Marquer la capacité spéciale comme indisponible
        specialAbilityAvailable = false;
    
        return true;
    }
    

    public void jouerTour(Champion ennemi) {
        if (this.getHealthPoints() <= 0) {
            System.out.println(this.getNom() + " a perdu la guerre !");
            return;
        }
    
        if (ennemi.getHealthPoints() <= 0) {
            System.out.println(ennemi.getNom() + " a perdu la guerre !");
            return;
        }
    
        MonstreInterface monstreAJouer = choixMonsterToPlay();
        if (monstreAJouer != null) {
            monsters.add(monstreAJouer);
        }    
        boolean capaciteSpeciale = false;
        if (!isUtilisee) { 
            Scanner scanner = new Scanner(System.in);
            System.out.print("Voulez-vous utiliser votre capacité spéciale ? (o/n) ");
            String choix = scanner.nextLine();
            if (choix.equalsIgnoreCase("o")) {
                capaciteSpeciale = true;
            }
        }   
        if (capaciteSpeciale) {
            for (MonstreInterface monstre : ennemi.getMonstres()) {
                monstre.setStatVie(monstre.getStatVie() - 1);
            }
            isUtilisee = true; 
        }

        for (MonstreInterface monstre : monstres) {
            System.out.println("Choisissez un monstre ennemi à attaquer :");
            for (int i = 0; i < ennemi.getMonstres().size(); i++) {
                System.out.println((i + 1) + ". " + ennemi.getMonstres().get(i).getName() + " (" + ennemi.getMonstres().get(i).getStatVie() + " PV)");
            }
            Scanner scanner = new Scanner(System.in);
            int choix = scanner.nextInt();
    
            if (choix >= 1 && choix <= ennemi.getMonstres().size()) {
                MonstreInterface cible = ennemi.getMonstres().get(choix - 1);
                monstre.attaquer(cible);
            } else {
                System.out.println("Choix invalide.");
            }
        }
    
        ennemi.jouerTour(this);
    }
}
