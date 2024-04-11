package projet_java;

public class Soigneur extends MonstreInterface {

    public Soigneur(String nom, int pv, int attaque) {
        super(nom, pv, attaque);
    }

    @Override
    public void soigner(Monstre cible, int pointsDeVie) {
        cible.setPv(cible.getPv() + pointsDeVie);
    }

}
