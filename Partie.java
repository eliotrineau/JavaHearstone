package projet_java;
import java.util.*;

public class Partie {

    public int nbTours;
    public int nbJoueurs = 2;

    public Joueur InitierDeckEmpire(Joueur j){
        Deck deck = new Deck();
        j.deck=deck.CreerDeck(j.deck);
        return j;
    }

    public Partie(int selection) {
        if(selection==1){//Fais pour gagner du temps meme si cela n'est pas optimal cela fonction.
            System.out.println("Soldat au rapport !\n\n");
            debutPartie();
        }else{
            regle();
        }
    }

    public void lireRegle(){
        Scanner read = new Scanner(System.in);
        int regle = read.nextInt();
        if(regle==2){
            regle();
        }
    }


    public Joueur initierJoueur(Joueur j1,int id){
        j1.Id=id;
        j1.Pseudo = j1.changerPseudo(j1.Pseudo);
        for (int i = 0; i < 7; i++) {
            j1.board.add(null);
        }
        return j1;
    }

    public void regle(){
        System.out.println("/////////////////////////////////////////////////\t\tLes Règles :\n\n");
        System.out.println("2 Joueurs s'affrontent en duel.");
        System.out.println("Le bute est de faire déscendre les points de vie de l'adversaire a 0");
        System.out.println("Pour cela vous aurez des cartes, un deck, et des points de vie");
        System.out.println("Vous allez commencer la partie avec 7 cartes en main.\n");
        System.out.println("Il existe différent type de cartes:\n\t-Les monstres \n\t-Les sors\n");
        System.out.println("Il existe différent type de monstres:\n\t-Les classiques, ils ont des points de vie et d'attaque, et une capacité spéciales.\n\t-Les protecteurs, lorsqu'ils sont sur le terrains vous ne pouvez attaquez autre choses qu'un protecteur\n\t-Les soigneur, ils ne peuvent pas attaquer et ne sont la que pour soigner\n\t-Les mascottes, il ne peuvent pas attaquer mais peuvent booster leur aliés\n");
        System.out.println("Pour gagner il faut que votre adversaire n'est plus de PV (PV<=0)");
        System.out.println("Un monstre meurt lorsqu'il a 0 PV ou moins");
        System.out.println("Les montres mort disparaissent du terrain et vont dans le cimetiere\n\n\n");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
    }

    public void debutPartie(){
        Joueur j1 = new Joueur(),j2 = new Joueur();
        Plateau board = new Plateau();
        Deck deck = new Deck();
        System.out.println("Vous allez vous affronter en 1 contre 1.\nLe bute est de tuer votre adversaire avec vos cartes.\nPour cela vous aurez un deck avec différentes cartes.\nAvant tous qu'elles sont vos nom soldat ?!\n\n");
        j1 =initierJoueur(j1,1);
        j2 =initierJoueur(j2,2);
        System.out.println(j1.Pseudo+" " +j2.Pseudo+"... Quels noms de ***** !\nBon tempi, vous connaisez vous les règles ?\n\n\t-1 Oui evidement !\n\t-2 Non, pourquoi faire ?");
        lireRegle();
        System.out.println("C'est bien soldat, vous avez 2 neuronne qui marche, vous avez compris les règles !\n\nMaintenant il va falloir choisir vôtre arme !\n");
        j1.deck=deck.creerDeckEmpire(j1.deck);
        j2.deck=deck.creerDeckEmpire(j2.deck);
        Collections.shuffle(j1.deck);
        Collections.shuffle(j2.deck);
        for (int i=0;i<7;i++){
            j1=distribuerCarte(j1);
            j2=distribuerCarte(j2);
        }
        board.AfficherPlateau(j1,j2);
        tourDeJeu( j1,  j2, board);
    }

    public Joueur distribuerCarte(Joueur j1){
        j1.main.add(j1.deck.get(0));
        j1.deck.remove(0);
        return j1;
    }

    public Joueur poserCartes(Joueur j1){
        Scanner read = new Scanner(System.in);
        System.out.println("Quelle carte voulez vous jouer ?");
        int indexCarte = read.nextInt()-1;
        while(indexCarte > 6 || indexCarte < 0){
            System.out.println("Erreur, veuillez retaper le numero (entre 1 et 7)");
            indexCarte = read.nextInt()-1;
        }
        System.out.println("Où voulez-vous poser la carte ?");
        int indexPlateau = read.nextInt()-1;
        while(indexPlateau > 6 || indexPlateau < 0 || j1.board.get(indexPlateau) != null){
            System.out.println("Erreur, veuillez retaper un numero valide (entre 1 et 7) et vide");
            indexPlateau = read.nextInt()-1;
        }
        j1.board.set(indexPlateau, j1.main.get(indexCarte));
        j1.main.remove(indexCarte);
        return j1;
    }

    public int attaquerMonstres(Joueur j1, Joueur j2,int Cible,int Monstre,Scanner read){
        int protecteur =0;
        System.out.println("Qu'elle monstre voulez vous attaquer ?(choississez le numero du monstre a attaquer, ou taper 10 pour le joueur)\n");
        Cible = read.nextInt()-1;
        for (int i=0;i<7;i++){
            if(j1.board.get(i)!=null){
                if(j1.board.get(i).getClass().getSimpleName().equals("Protecteur")){
                    protecteur++;
                }
            }
        }
        while((Cible!=9 && Cible>6) || Cible<0){
            System.out.println("Erreur, il n'y a pas de monstres a cette emplacement (choississez le numero du monstre a attaquer, ou taper 10 pour le joueur)");
            Cible = read.nextInt();
        }
        while(Cible==9 && protecteur!=0){
            System.out.println("Erreur, il y a un monstre protecteur sur le terrain bous ne pouvez pas attaquer votre adversaire directement(choississez le numero du monstre a attaquer)");
            Cible = read.nextInt();
        }
        if(Cible==9){
            j2.pV-=j1.board.get(Monstre).getAttaque();
        }else{
            while(j2.board.get(Cible)==null){
                System.out.println("Erreur, il n'y a pas de monstres a cette emplacement (choississez le numero du monstre a attaquer, ou taper 10 pour le joueur)");
                Cible = read.nextInt();
            }
            j2.board.get(Cible).setPv(j2.board.get(Cible).getPv()-j1.board.get(Monstre).getAttaque());
            j1.board.get(Cible).setPv(j1.board.get(Cible).getPv()-j2.board.get(Monstre).getAttaque());
        }
        return Cible;
    }

    public int verifMonstrePossible(int Monstre,Scanner read,Joueur j1){
        System.out.println("Avec qu'elle monstre voulez vous attaquer ?\n");
        Monstre = read.nextInt()-1;
        while(Monstre>7 || Monstre<0){
            System.out.println("Erreur, il n'y a pas de monstres a cette emplacement");
            Monstre = read.nextInt();

        }
        while((j1.board.get(Monstre)==null)) { //il faut d'abord verifier que les valeur de monstres soit dans les normes sinon cela créer une erreur "IndexOutOfBoungs"
            System.out.println("Erreur, il n'y a pas de monstres a cette emplacement");
            Monstre = read.nextInt();
        }
        return Monstre;
    }

    public void verifMonstrepV(Joueur j1,int index){
        if(j1.board.get(index).getPv()<=0){
            j1.cimetiere.add(j1.board.get(index));
            j1.board.set(index, null);
        }
    }

    public Boolean verifJoueur(Joueur j1){
        if(j1.pV<=0){
            return false;
        }else{
            return true;
        }
    }

    public void Victoire(Joueur j1){
        System.out.println("Bravo "+j1.Pseudo+", Vous avez gagnez la guerre");
    }

    public void tourDeJeu(Joueur j1, Joueur j2,Plateau board){
        int jA = 1,choix=0,Cible=0,Monstre=0,gagnant=0; //jA pour Joueur Actuelle,Cible pour selectionner le monstre attaquer,Monstre pour notre monstre selectionner
        Joueur jC,jAd;//jC pour joueur Courant et jAd pour jouer Adverse
        boolean partie = true;
        Scanner read = new Scanner(System.in);
        // Boucle de jeu
        while (partie) {
            // Sélectionnez le joueur actuel
            if(jA==1){
                 jC = j1;
                 jAd = j2;
            }else{
                 jC = j2;
                 jAd = j1;
            }
            board.CartesJoueur(jC);
            System.out.println(j1.Pseudo + " voici vos point de vie actuelle" + j1.pV);
            System.out.println("Voulez vous posez une carte ?\n\t-1 oui\n\t-2 non");
            choix = read.nextInt();
            while(choix!=1 && choix!=2){
                System.out.println("Erreur veuillez retaper votre choix (1:oui | 2:non)\n");
            }
            if(choix==1){
                poserCartes(jC);

            }
            System.out.println("Voulez vous utiliser une capacité ?\n\t-1 oui\n\t-2 non");
            choix = read.nextInt();
            while(choix!=1 && choix!=2){
                System.out.println("Erreur veuillez retaper votre choix (1:oui | 2:non)\n");
            }
            if(choix==1){
//                poserCartes(jC);
            }
            System.out.println("Voulez vous attaquer un monstre ?\n\t-1 oui\n\t-2 non");
            choix = read.nextInt();
            while(choix!=1 && choix!=2){
                System.out.println("Erreur veuillez retaper votre choix (1:oui | 2:non)\n");
            }
            if(choix==1){
                Monstre = verifMonstrePossible(Monstre,read,jC);
                Cible = attaquerMonstres(jC,jAd,Cible,Monstre,read);
                verifMonstrepV(j1,Monstre);
                if(Cible==9){
                    partie = verifJoueur(jAd);
                    gagnant = (jA == 1) ? 1 : 2;
                    continue;
                }else{
                    verifMonstrepV(jAd,Cible);
                }
            }
            board.AfficherPlateau(j1,j2);

            // Passez au joueur suivant
            jC = distribuerCarte(jC);
            jA = (jA == 1) ? 2 : 1;
            if(j1.pV<=0 || j2.pV<=0){
                partie = false;
            }
        }
        if(gagnant==1){
            Victoire(j1);
        }else{
            Victoire(j2);
        }
    }

}
