package projet_java;

import java.util.*;

import static java.lang.constant.ConstantDescs.NULL;

public class Joueur {
     public ArrayList<Card> deck = new ArrayList<>(30);
    public ArrayList<Card> cimetiere = new ArrayList<>(30);
    public ArrayList<Card> board = new ArrayList<>(7);
    public ArrayList<Card> main = new ArrayList<>(7); //Limite la main du joueur pour qu'il ne puisse pasa voir tous son deck en main
    public String Pseudo;
    public int pV = 5;
    public int Clan = 1;
    public int Id;

    public Joueur(){
    }

    //Je ne retourne rien car si on modifie uin tableau cela modifie par addresse et non par valeur
    public String changerPseudo(String pseudo){
        Scanner read = new Scanner(System.in);
        System.out.println("Joueur"+ Id +" qu'elle pseudo veux-tu (pour une meilleur lisibilité donne meux seulement 8 caractères?\n");
        pseudo = read.nextLine();
        while((pseudo.equals(NULL)) || (pseudo.length()>8)){
            System.out.println("Erreur, pseudo vide ou vous avez depassez les 8 caractère,qu'elle pseudo veux-tu ?\n");
            pseudo = read.nextLine();
        }
        return pseudo;
    }

//    public Joueur ChoixDeck(Joueur j1,Map<Integer, Card> cardMap){
//        int i=0;
//        for(Map.Entry<Integer, Card> entry : cardMap.entrySet()){
//            j1.deck[i] = entry.getValue();
//            i++;
//        }
//        return j1;
//    }

//    public void Cimetiere(int index) {
//        if (index >= 0 && index < board.) {
//            // Vérifier si la carte à déplacer existe dans le board
//            if (board[index] != null) {
//                // Chercher la première case vide dans le cimetière
//                int i = 0;
//                while (i < cimetiere.length && cimetiere[i] != null) {
//                    i++;
//                }
//                // Si le cimetière n'est pas plein, déplacer la carte
//                if (i < cimetiere.length) {
//                    cimetiere[i] = board[index];
//                    board[index] = null;
//                }
//            }
//        }
//    }

//    public Card choixDeck(){
//        System.out.println("");
//    }

}
