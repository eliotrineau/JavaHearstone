package projet_java;

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
    void soigner(MonstreBasique cible, int pointsDeVie);

    void soigner(Monstre cible, int pointsDeVie);
}
