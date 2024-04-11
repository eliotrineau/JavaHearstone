package projet_java;
import java.util.*;

public class Plateau {

    public String separateur = "////";

    public String bordure="////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////";

    public String Bord = "////////////////////////";

    public String Modifetexte(String texte){
        if(texte.length()<=8){
            switch(texte.length()){
                case 1:
                    texte += "       ";
                    break;
                case 2:
                    texte += "      ";
                    break;
                case 3:
                    texte += "     ";
                    break;
                case 4:
                    texte += "    ";
                    break;
                case 5:
                    texte += "   ";
                    break;
                case 6:
                    texte += "  ";
                    break;
                case 7:
                    texte += " ";
                    break;
            }
        }
        return texte;
    }

    public String afficherChiffre(int chiffre){
            if(chiffre<10){
                return " 0"+chiffre;
            }
            return " "+chiffre;
    }

    public int afficherTaille(Object[] object){
        return compterCasesRemplies(object);
    }

    public int compterCasesRemplies(Object[] tableau) {
        int compteur = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (!tableau[i].equals(0)) {
                compteur++;
            }
        }
        return compteur;
    }

    public void AfficherPlateau(Joueur j1,Joueur j2) {
        System.out.println("\n\n");
        System.out.println(bordure);
        System.out.println(separateur+"\t"+"|\t\t  "+Modifetexte(j1.Pseudo)+"      |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+"|         Pioche        |"+"\t"+separateur);
        System.out.println(separateur+"\t"+"|          "+ afficherChiffre(j2.pV)+"          |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|\t\t\t\t        |"+"\t"+separateur);
        System.out.println(separateur+"\t"+"|\t\t\t\t        |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|_______________________|"+"\t"+separateur);
        System.out.println(separateur+"\t"+"|                       |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|       Cimetiere       |"+"\t"+separateur);
        System.out.println(separateur+"\t"+"|\t\t\t\t        |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|\t\t\t\t        |"+"\t"+separateur);
        System.out.println(separateur+"\t"+Bord+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+Bord+"\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t"+Bord+Bord+Bord+Bord+Bord+Bord+Bord+"\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t|1"+AfficherCartes(j1,0)+"||2"+AfficherCartes(j1,1)+"||3"+AfficherCartes(j1,2)+"||4"+AfficherCartes(j1,3)+"||5"+AfficherCartes(j1,4)+"||6"+AfficherCartes(j1,5)+"||7"+AfficherCartes(j1,6)+"|\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t|\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        |\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t|\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        |\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t|\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        |\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t"+Bord+Bord+Bord+Bord+Bord+Bord+Bord+"\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t"+Bord+Bord+Bord+Bord+Bord+Bord+Bord+"\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t|1"+AfficherCartes(j2,0)+"||2"+AfficherCartes(j2,1)+"||3"+AfficherCartes(j2,2)+"||4"+AfficherCartes(j2,3)+"||5"+AfficherCartes(j2,4)+"||6"+AfficherCartes(j2,5)+"||7"+AfficherCartes(j2,6)+"|\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t|\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        |\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t|\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        |\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t|\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        ||\t\t\t\t        |\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t"+Bord+Bord+Bord+Bord+Bord+Bord+Bord+"\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+separateur);
        System.out.println(separateur+"\t"+Bord+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+Bord+"\t"+separateur);
        System.out.println(separateur+"\t"+"|       Cimetiere       |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|\t\t  "+Modifetexte(j2.Pseudo)+"      |"+"\t"+separateur);
        System.out.println(separateur+"\t"+"|          "+ "            |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|          "+ afficherChiffre(j2.pV)+"          |"+"\t"+separateur);
        System.out.println(separateur+"\t"+"|_______________________|"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|\t\t\t\t        |"+"\t"+separateur);
        System.out.println(separateur+"\t"+"|        Pioche         |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|\t\t\t\t        |"+"\t"+separateur);
        System.out.println(separateur+"\t"+"|\t\t\t\t        |"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "|\t\t\t\t        |"+"\t"+separateur);
        System.out.println(bordure);
    }

    public void CartesJoueur(Joueur j1){
        System.out.println("\t\t\t\t\t\t"+Bord+Bord+Bord+Bord+Bord+Bord+Bord+"\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t|"+j1.main.get(0).name+"||"+j1.main.get(1).name+"||"+j1.main.get(2).name+"||"+j1.main.get(3).name+"||"+j1.main.get(4).name+"||"+j1.main.get(5).name+"||"+j1.main.get(6).name+"|\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t|                       ||                       ||                       ||                       ||                       ||                       ||                       |\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t|                       ||                       ||                       ||                       ||                       ||                       ||                       |\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t"+Bord+Bord+Bord+Bord+Bord+Bord+Bord+"\t\t\t\t\t");

    }

    public String AfficherCartes(Joueur j1,int index){
        if(j1.board.get(index)==null){
            return "                       ";
        }else{
            return j1.board.get(index).name;
        }
    }
}
