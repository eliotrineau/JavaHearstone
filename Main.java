package projet_java;
import java.util.*;

public class Main  {

    public static void main(String[] args) {
        System.out.println("Hugo - Eliot\n\n\n");
        boolean menu=false;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tBonjour et Bienvenue dans Heartstone !!!!\n\n ");
        Scanner read = new Scanner(System.in);
        while(!menu) {
            System.out.println("/////////////////////////////////////////////////\t\tVoici le menu:\n\n\t\t-1: Lancer une partie\n\t\t-2: Règle\n\t\t-3: Quitter\n\n");
            System.out.println("Veuillez taper le numero de vôtre choix : \n");
            int choix = read.nextInt();
            while (choix > 4 || choix < 1) {
                System.out.println("Erreur, vous avez taper une valeur trop grand ou trop petit. Veuillez retaper votre choix:\n");
                read = new Scanner(System.in);
                choix = read.nextInt();
            }
            switch (choix) {
                case 1:
                    new Partie(1);
                    menu = true;
                    break;

                case 2:
                    new Partie(0);
                    new Main();
                    break;

                case 3:
                    Quitter quitter = new Quitter();
                    quitter.QuitterMenu();
                    menu = true;
                    break;
                case 4:
//                    Plateau plateau = new Plateau();
//                    plateau.AfficherPlateau();
//                    break;
            }
        }
        read.close();
    }
}
