public interface MonstreInterface {
    void attaquer(MonstreInterface cible);
    void soigner(MonstreInterface cible);
    void booster(MonstreInterface cible);
    int getStatAttaque();
    int getStatVie();
    String getNom();
    boolean isProtecteur();
    boolean isSoigneur();
    boolean isBoost();
}
