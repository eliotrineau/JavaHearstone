package projet_java;


import java.util.Map;
import java.util.HashMap;


public class Card {
    public String name;
    private int mana;
    private int attaque;
    private int pv;
    private Boolean visible;
    private String pouvoir;
    public int role; //1-basique 2-protecteur 3-boost 4-soigneur


    public Card(String name, int mana, int attaque, int pv, Boolean visible, String pouvoir) {
        this.name = name;
        this.mana = mana;
        this.attaque = attaque;
        this.pv = pv;
        this.visible = visible;
        this.pouvoir = pouvoir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    } 

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getPouvoir() {
        return pouvoir;
    }

    public void setPouvoir(String pouvoir) {
        this.pouvoir = pouvoir;
    }

    public interface mort {//Selon le deck choisit la mort sera différente et donc les messages de mort vont variés selon le deck, mais seront propre aux unités d'un deck et a un groupe (les soigneurs sont un groupe)
        void mort();
    }

    public Card attaquer(Card carte1,Card carte2){
        carte2.pv -= carte1.attaque;
        return carte2;
    }


}

