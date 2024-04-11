package projet_java;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.awt.image.BufferedImage;


public class Background extends JPanel {
    private BufferedImage backgroundImage;

    public void BackgroundPanel() {
        try {
            // charger l'image de fond à partir d'une URL ou d'un fichier
            URL url = new URL("C:\\Users\\hugov\\OneDrive\\Bureau\\cours\\cours_java\\menu.jpg");
            backgroundImage = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            // dessiner l'image de fond sur le panneau
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}
