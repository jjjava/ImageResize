package br.com.schumaker.sandbox.ex4;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author hudson.sales
 */
public class CoreFrMain {

    private static final CoreFrMain INSTANCE = new CoreFrMain();
    private File fileOriginal;

    private CoreFrMain() {

    }

    public static CoreFrMain getInstance() {
        return INSTANCE;
    }

    public void open() {
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home"));
        chooser.setDialogTitle("Abrir arquivo");
        chooser.setApproveButtonText("Abrir");
        int sf = chooser.showOpenDialog(null);
        if (sf == JFileChooser.APPROVE_OPTION) {
            try {
                fileOriginal =  chooser.getSelectedFile();
                Image image = ImageIO.read(fileOriginal);
                ScrollPaneDemo scrollPaneDemo = new ScrollPaneDemo(image);
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }

    public void createImage(int w, int h) {

        File newFile = new File("C:/here.png");
        try {
            // scale image on disk
            BufferedImage originalImage = ImageIO.read(fileOriginal);
            int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB
                    : originalImage.getType();

            BufferedImage resizeImagePng = resizeImage(originalImage, type, w, h);
            ImageIO.write(resizeImagePng, "png", newFile);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int type,
            Integer img_width, Integer img_height) {

        BufferedImage resizedImage = new BufferedImage(img_width, img_height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, img_width, img_height, null);
        g.dispose();
        return resizedImage;
    }

    public void save() {

    }

    public void saveAs() {
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home"));
        chooser.setDialogTitle("Salvar arquivo");
        chooser.setApproveButtonText("Salvar");

        int sf = chooser.showSaveDialog(null);
        if (sf == JFileChooser.APPROVE_OPTION) {
            System.out.println(chooser.getSelectedFile().getName());
        }
    }

    public void exit() {
        System.exit(0);
    }
}
