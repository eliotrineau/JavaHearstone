package projet_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Deck {


    public ArrayList<Card> CreerDeck(ArrayList<Card> deck){
        // Ajouter des cartes à la HashMap
        deck.add( new Card("Carte 1", 1, 5, 8, false, ""));
        deck.add( new Card( "Carte 2", 1, 4, 6, false, ""));
        deck.add( new Card( "Carte 3", 1, 4, 6, false, ""));
        deck.add( new Card( "Carte 4", 2, 4, 6, false, ""));
        deck.add( new Card( "Carte 5", 2, 4, 6, false, ""));
        deck.add( new Card( "Carte 6", 2, 4, 6, false, ""));
        deck.add( new Card( "Carte 7", 2, 4, 6, false, ""));
        deck.add( new Card( "Carte 8", 3, 4, 6, false, ""));
        deck.add( new Card( "Carte 9", 3, 4, 6, false, ""));
        deck.add( new Card("Carte 10", 3, 4, 6, false, ""));
        deck.add( new Card( "Carte 11", 3, 4, 6, false, ""));
        deck.add( new Card( "Carte 12", 4, 4, 6, false, ""));

        deck.add( new Protecteur( "Carte 13", 2, 2, 2, false, ""));
        deck.add( new Protecteur( "Carte 14", 2, 2, 3, false, ""));
        deck.add( new Protecteur( "Carte 15", 3, 4, 2, false, ""));
        deck.add( new Protecteur( "Carte 16", 4, 5, 4, false, ""));
        deck.add( new Protecteur( "Carte 17", 4, 4, 5, false, ""));
        deck.add( new Protecteur( "Carte 18", 5, 6, 6, false, ""));

        deck.add( new Boost( "Carte 19", 2, 1, 1, false, ""));
        deck.add( new Boost( "Carte 20", 2, 1, 1, false, ""));
        deck.add( new Boost( "Carte 21", 3, 1, 2, false, ""));
        deck.add( new Boost( "Carte 22", 4, 1, 2, false, ""));
        deck.add( new Boost( "Carte 23", 4, 1, 3, false, ""));
        deck.add( new Boost( "Carte 24", 5, 1, 3, false, ""));

        deck.add( new Soigneur( "Carte 25", 2, 0, 2, false, ""));
        deck.add( new Soigneur( "Carte 26", 3, 0, 3, false, ""));
        deck.add( new Soigneur( "Carte 27", 3, 0, 3, false, ""));
        deck.add( new Soigneur( "Carte 28", 4, 0, 3, false, ""));
        deck.add( new Soigneur( "Carte 29", 4, 0, 4, false, ""));
        deck.add( new Soigneur( "Carte 30", 5, 0, 6, false, ""));
        return deck;
    }

    public ArrayList<Card> ModifierNom(ArrayList<Card> deck, int numero, String Nom) {
        Card card = deck.get(numero);
        card.setName(Nom);
        return deck;
    }

    public ArrayList<Card> ModifierPouvoir(ArrayList<Card> deck, int numero,String pouvoir) {
        Card card = deck.get(numero);
        card.setPouvoir(pouvoir);
        return deck;
    }

    public ArrayList<Card> ModifierVisibile(ArrayList<Card> deck, int numero,Boolean visibilite) {
        Card card = deck.get(numero);
        card.setVisible(visibilite);
        return deck;
    }

    public ArrayList<Card> creerDeckEmpire(ArrayList<Card> deck){

            // Ajouter les cartes de rôle 1
            deck.add(new Guerrier("Sergent-chef Thunder", 1, 5, 8, true,""));
            deck.add(new Guerrier("Capitaine Faucon", 1, 4, 6, true,""));
            deck.add(new Guerrier("Lieutenant Éclair", 1, 4, 6, true,""));
            deck.add(new Guerrier("Soldat d'élite Tonnerre", 2, 4, 6, true,""));
            deck.add(new Guerrier("Commandant Hurricane", 2, 4, 6, true,""));
            deck.add(new Guerrier("Major Sabre", 2, 4, 6, true,""));
            deck.add(new Guerrier("Sergent-major Foudre", 2, 4, 6, true,""));
            deck.add(new Guerrier("Caporal-chef Dragon", 3, 4, 6, true,""));
            deck.add(new Guerrier("Soldat de première classe Ouragan", 3, 4, 6, true,""));
            deck.add(new Guerrier("Adjudant-chef Bélier", 3, 4, 6, true,""));
            deck.add(new Guerrier("Lieutenant-colonel Tigre", 4, 4, 6, true,""));
            deck.add(new Guerrier("Sergent Panthère", 4, 4, 6, true,""));

            // Ajouter les cartes de rôle 2
            deck.add(new Protecteur("Sentinelle Bouclier", 2, 2, 2, true,""));
            deck.add(new Protecteur("Gardien Rempart", 2, 2, 3, true,""));
            deck.add(new Protecteur("Défenseur Muraille", 3, 4, 2, true,""));
            deck.add(new Protecteur("Protecteur Cuirasse", 4, 5, 4, true,""));
            deck.add(new Protecteur("Paladin Égide", 4, 4, 5, true,""));
            deck.add(new Protecteur("Chevalier Fortifier", 5, 6, 6, true,""));

            // Ajouter les cartes de rôle 3
            deck.add(new Boost("Éclaireur Rapidité", 2, 1, 1, true,""));
            deck.add(new Boost("Soutien Tactique", 2, 1, 1, true,""));
            deck.add(new Boost("Logisticien Ravitaillement", 3, 1, 2, true,""));
            deck.add(new Boost("Artificier Explosif", 4, 1, 2, true,""));
            deck.add(new Boost("Spécialiste Furitivité", 4, 1, 3, true,""));
            deck.add(new Boost("Ingénieur Amélioration", 5, 1, 3, true,""));

            // Ajouter les cartes de rôle 4
            deck.add(new Soigneur("Guérisseur Espoir", 2, 0, 2, true,""));
            deck.add(new Soigneur("Médecin-chef Régénération", 3, 0, 3, true,""));
            deck.add(new Soigneur("Infirmier de combat Vitalité", 3, 0, 3, true,""));
            deck.add(new Soigneur("Thérapeute Bien-être", 4, 0, 3, true,""));
            deck.add(new Soigneur("Soigneur Réconfort", 4, 0, 4, true,""));
            deck.add(new Soigneur("Chirurgien de campagne Sauveur", 5, 0, 6, true,""));

            return deck;
        }



}
