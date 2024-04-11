package projet_java;

public class Soigneur extends Card{
    public Soigneur(String name, int mana, int attaque, int pv, Boolean visible, String pouvoir) {
        super(name, mana, attaque, pv, visible, pouvoir);
    }

    @Override
    public void setAttaque(int attaque) {
        super.setAttaque(0);
    }

    @Override
    public void setPouvoir(String pouvoir) {
        super.setPouvoir("soins");
    }
}
