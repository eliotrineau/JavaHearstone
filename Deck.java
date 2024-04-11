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
        deck.add(new Guerrier("Sergent-chef", 1, 5, 8, true, "Frappe éclair"));
        deck.add(new Guerrier("Capitaine", 1, 4, 6, true, "Vision perçante"));
        deck.add(new Guerrier("Lieutenant", 1, 4, 6, true, "Attaque fulgurante"));
        deck.add(new Guerrier("Soldat d'élite", 2, 4, 6, true, "Choc sonique"));
        deck.add(new Guerrier("Commandant", 2, 4, 6, true, "Tourbillon dévastateur"));
        deck.add(new Guerrier("Major", 2, 4, 6, true, "Lame tranchante"));
        deck.add(new Guerrier("Sergent-major", 2, 4, 6, true, "Électrocution"));
        deck.add(new Guerrier("Caporal-chef", 3, 4, 6, true, "Souffle de feu"));
        deck.add(new Guerrier("Soldat de première", 3, 4, 6, true, "Rafale dévastatrice"));
        deck.add(new Guerrier("Adjudant-chef", 3, 4, 6, true, "Charge puissante"));
        deck.add(new Guerrier("Lieutenant-colonel", 4, 4, 6, true, "Griffe acérée"));
        deck.add(new Guerrier("Sergent", 4, 4, 6, true, "Agilité féline"));
    
        // Ajouter les cartes de rôle 2
        deck.add(new Protecteur("Sentinelle", 2, 2, 2, true, "Protection renforcée"));
        deck.add(new Protecteur("Gardien", 2, 2, 3, true, "Barrière infranchissable"));
        deck.add(new Protecteur("Défenseur", 3, 4, 2, true, "Mur impénétrable"));
        deck.add(new Protecteur("Protecteur", 4, 5, 4, true, "Armure lourde"));
        deck.add(new Protecteur("Paladin", 4, 4, 5, true, "Bouclier divin"));
        deck.add(new Protecteur("Chevalier", 5, 6, 6, true, "Renforcement des alliés"));
    
        // Ajouter les cartes de rôle 3
        deck.add(new Boost("Éclaireur", 2, 1, 1, true, "Accélération"));
        deck.add(new Boost("Soutien", 2, 1, 1, true, "Stratégie avancée"));
        deck.add(new Boost("Logisticien", 3, 1, 2, true, "Approvisionnement amélioré"));
        deck.add(new Boost("Artificier", 4, 1, 2, true, "Charge explosive"));
        deck.add(new Boost("Spécialiste", 4, 1, 3, true, "Camouflage avancé"));
        deck.add(new Boost("Ingénieur", 5, 1, 3, true, "Amélioration des équipements"));
    
        // Ajouter les cartes de rôle 4
        deck.add(new Soigneur("Guérisseur", 2, 0, 2, true, "Soins régénérateurs"));
        deck.add(new Soigneur("Médecin-chef", 3, 0, 3, true, "Régénération cellulaire"));
        deck.add(new Soigneur("Infirmier", 3, 0, 3, true, "Injection de vitalité"));
        deck.add(new Soigneur("Thérapeute", 4, 0, 3, true, "Thérapie avancée"));
        deck.add(new Soigneur("Soigneur", 4, 0, 4, true, "Soutien moral"));
        deck.add(new Soigneur("Chirurgien", 5, 0, 6, true, "Intervention chirurgicale"));
    
        return deck;
    }

        public ArrayList<Card> creerDeckMutant(ArrayList<Card> deck){

            // Ajouter les cartes de rôle 1 pour les mutants
            deck.add(new Guerrier("Faucheur", 1, 5, 8, true,"Frappe dévastatrice"));
            deck.add(new Guerrier("Rampage", 1, 4, 6, true,"Colère incontrôlable"));
            deck.add(new Guerrier("Furie", 1, 4, 6, true,"Vitesse fulgurante"));
            deck.add(new Guerrier("Prédator", 2, 4, 6, true,"Camouflage actif"));
            deck.add(new Guerrier("Tornade", 2, 4, 6, true,"Tourbillon dévastateur"));
            deck.add(new Guerrier("Foudroyeur", 2, 4, 6, true,"Éclairs dévastateurs"));
            deck.add(new Guerrier("Gladiateur", 2, 4, 6, true,"Combat rapproché"));
            deck.add(new Guerrier("Berserker", 3, 4, 6, true,"Rage incontrôlable"));
            deck.add(new Guerrier("Mégalodon", 3, 4, 6, true,"Mâchoires d'acier"));
            deck.add(new Guerrier("Kraken", 3, 4, 6, true,"Tentacules dévastatrices"));
            deck.add(new Guerrier("Colosse", 4, 4, 6, true,"Force surhumaine"));
            deck.add(new Guerrier("Titan", 4, 4, 6, true,"Puissance dévastatrice"));
    
            // Ajouter les cartes de rôle 2 pour les mutants
            deck.add(new Protecteur("Muraille", 2, 2, 2, true,"Bouclier protecteur"));
            deck.add(new Protecteur("Rempart", 2, 2, 3, true,"Armure renforcée"));
            deck.add(new Protecteur("Bastion", 3, 4, 2, true,"Barrière énergétique"));
            deck.add(new Protecteur("Gardien", 4, 5, 4, true,"Protection totale"));
            deck.add(new Protecteur("Défenseur", 4, 4, 5, true,"Contre-attaque"));
            deck.add(new Protecteur("Fortificateur", 5, 6, 6, true,"Renforcement des alliés"));
    
            // Ajouter les cartes de rôle 3 pour les mutants
            deck.add(new Boost("Accélérateur", 2, 1, 1, true,"Augmentation de la vitesse"));
            deck.add(new Boost("Amplificateur", 2, 1, 1, true,"Augmentation de la puissance"));
            deck.add(new Boost("Multiplicateur", 3, 1, 2, true,"Duplication des attaques"));
            deck.add(new Boost("Surchargeur", 4, 1, 2, true,"Surpuissance temporaire"));
            deck.add(new Boost("Dopant", 4, 1, 3, true,"Amélioration des capacités"));
            deck.add(new Boost("Catalyseur", 5, 1, 3, true,"Activation des pouvoirs latents"));
    
            // Ajouter les cartes de rôle 4 pour les mutants
            deck.add(new Soigneur("Régénérateur", 2, 0, 2, true,"Soins régénérateurs"));
            deck.add(new Soigneur("Guérisseur", 3, 0, 3, true,"Soins intensifs"));
            deck.add(new Soigneur("Réparateur", 3, 0, 3, true,"Réparation des blessures"));
            deck.add(new Soigneur("Thaumaturge", 4, 0, 3, true,"Soins miraculeux"));
            deck.add(new Soigneur("Médecin", 4, 0, 4, true,"Soins avancés"));
            deck.add(new Soigneur("Sauveur", 5, 0, 6, true,"Résurrection des alliés"));
    
            return deck;
        }

        public ArrayList<Card> creerDeckRobot(ArrayList<Card> deck){

            // Ajouter les cartes de rôle 1 pour les robots
            deck.add(new Guerrier("Sentinelle", 1, 5, 8, true,"Scanner de menaces"));
            deck.add(new Guerrier("Centurion", 1, 4, 6, true,"Bouclier énergétique"));
            deck.add(new Guerrier("Gladiateur", 1, 4, 6, true,"Lames rotatives"));
            deck.add(new Guerrier("Commando", 2, 4, 6, true,"Infiltration"));
            deck.add(new Guerrier("Titan", 2, 4, 6, true,"Missiles à tête chercheuse"));
            deck.add(new Guerrier("Juggernaut", 2, 4, 6, true,"Charge dévastatrice"));
            deck.add(new Guerrier("Dévastateur", 2, 4, 6, true,"Canon à plasma"));
            deck.add(new Guerrier("Exterminateur", 3, 4, 6, true,"Rayon d'annihilation"));
            deck.add(new Guerrier("Goliath", 3, 4, 6, true,"Écrasement"));
            deck.add(new Guerrier("Léviathan", 3, 4, 6, true,"Tentacules mécaniques"));
            deck.add(new Guerrier("Colosse", 4, 4, 6, true,"Force herculéenne"));
            deck.add(new Guerrier("Destructeur", 4, 4, 6, true,"Frappe orbitale"));
    
            // Ajouter les cartes de rôle 2 pour les robots
            deck.add(new Protecteur("Bouclier", 2, 2, 2, true,"Barrière protectrice"));
            deck.add(new Protecteur("Rempart", 2, 2, 3, true,"Champ de force"));
            deck.add(new Protecteur("Bastion", 3, 4, 2, true,"Mur d'énergie"));
            deck.add(new Protecteur("Gardien", 4, 5, 4, true,"Protection renforcée"));
            deck.add(new Protecteur("Défenseur", 4, 4, 5, true,"Contre-mesures"));
            deck.add(new Protecteur("Fortificateur", 5, 6, 6, true,"Renforcement des alliés"));
    
            // Ajouter les cartes de rôle 3 pour les robots
            deck.add(new Boost("Propulseur", 2, 1, 1, true,"Accélération"));
            deck.add(new Boost("Amplificateur", 2, 1, 1, true,"Augmentation de la puissance"));
            deck.add(new Boost("Multiplicateur", 3, 1, 2, true,"Duplication des attaques"));
            deck.add(new Boost("Surchargeur", 4, 1, 2, true,"Surpuissance temporaire"));
            deck.add(new Boost("Dopant", 4, 1, 3, true,"Amélioration des capacités"));
            deck.add(new Boost("Catalyseur", 5, 1, 3, true,"Activation des pouvoirs latents"));
    
            // Ajouter les cartes de rôle 4 pour les robots
            deck.add(new Soigneur("Réparateur", 2, 0, 2, true,"Réparation rapide"));
            deck.add(new Soigneur("Restaurateur", 3, 0, 3, true,"Restauration des systèmes"));
            deck.add(new Soigneur("Régénérateur", 3, 0, 3, true,"Régénération des boucliers"));
            deck.add(new Soigneur("Thaumaturge", 4, 0, 3, true,"Réparation avancée"));
            deck.add(new Soigneur("Médecin", 4, 0, 4, true,"Soins aux alliés organiques"));
            deck.add(new Soigneur("Sauveur", 5, 0, 6, true,"Résurrection des alliés"));
    
            return deck;
        }

}
