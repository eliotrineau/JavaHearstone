package projet_java;

public class Mascotte extends MonstreInterface {

    public Mascotte(String nom, int pv, int attaque) {
        super(nom, pv, attaque);
    }

    @Override
    public void booster(MonstreInterface cible, int boost) {
        cible.setAttaque(cible.getAttaque() + boost);
    }
}

