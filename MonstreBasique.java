package projet_java;

public class MonstreBasique implements MonstreInterface {
    private final String nom;
    private int statAttaque;
    private int statVie;
    protected boolean peutAttaquer;


    public MonstreBasique(String nom, int statAttaque, int statVie) {
        this.nom = nom;
        this.statAttaque = statAttaque;
        this.statVie = statVie;
    }

    @Override
    public void attaquer(MonstreInterface cible) {
        cible.soin(new Soin(-statAttaque, null));
    }

    @Override
    public int getStatAttaque() {
        return statAttaque;
    }

    @Override
    public int getStatVie() {
        return statVie;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public boolean isProtecteur() {
        return false;
    }

    @Override
    public boolean isSoigneur() {
        return false;
    }

    @Override
    public boolean isBoost() {
        return false;
    }

    public boolean peutAttaquer() {
        return peutAttaquer;
    }

    public void setPeutAttaquer(boolean peutAttaquer) {
        this.peutAttaquer = peutAttaquer;
    }
}

