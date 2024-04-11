package projet_java;

public class Protecteur extends Card{
    public Protecteur(String name, int mana, int attaque, int pv, Boolean visible, String pouvoir) {
        super(name, mana, attaque, pv, visible, pouvoir);
    }

    @Override
    public void setPouvoir(String pouvoir) {
        super.setPouvoir("protection");
    }
}
