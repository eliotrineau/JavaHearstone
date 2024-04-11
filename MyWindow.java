package projet_java;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        super("Mon menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920, 1080);

        // Charger l'image de fond
        ImageIcon backgroundImage = new ImageIcon("menu.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Définir la disposition du conteneur de contenu
        setLayout(new BorderLayout());

        // Ajouter le label avec l'image de fond au conteneur de contenu
        add(backgroundLabel, BorderLayout.CENTER);

        // Créer le panneau pour les boutons du menu
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setOpaque(false);

        // Charger les images pour les boutons et créer les boutons
        ImageIcon startImage = new ImageIcon("C:\\Users\\hugov\\IdeaProjects\\Projet_Java\\Assets\\Assets\\Menu\\start.png");
        JLabel startButton = new JLabel(startImage);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        startButton.setPreferredSize(new Dimension(200, 50));
        menuPanel.add(startButton);

        ImageIcon optionsImage = new ImageIcon("options.png");
        JLabel optionsButton = new JLabel(optionsImage);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        menuPanel.add(optionsButton);

        ImageIcon loadImage = new ImageIcon("load.png");
        JLabel loadButton = new JLabel(loadImage);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        menuPanel.add(loadButton);

        ImageIcon exitImage = new ImageIcon("exit.png");
        JLabel exitButton = new JLabel(exitImage);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        menuPanel.add(exitButton);


        // Créer un panneau pour contenir le panneau de boutons
        JPanel menuContainer = new JPanel(new GridBagLayout());
        menuContainer.setOpaque(false);



        // Ajouter le panneau de boutons au conteneur de contenu
        add(menuPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyWindow());
    }
}
