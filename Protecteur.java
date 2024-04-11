package projet_java;

public class Protecteur extends Card {

    public Protecteur(String nom, int pv, int attaque) {
        super(nom, pv, attaque);
    }

    public void empecherAttaque(Monstre cible) {
        cible.setPeutAttaquer(false);
    }
}

