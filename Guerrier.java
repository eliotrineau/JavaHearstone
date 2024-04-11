package projet_java;

public class Guerrier extends MonstreInterface {

    public Guerrier(String nom, int pv, int attaque) {
        super(nom, pv, attaque);
    }

    @Override
    public void attaquer(Monstre cible) {
        cible.setPv(cible.getPv() - getAttaque());
    }
}
