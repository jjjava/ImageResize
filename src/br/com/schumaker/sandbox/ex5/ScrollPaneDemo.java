/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.sandbox.ex5;

/**
 *
 * @author hudson.sales
 */
import br.com.schumaker.sandbox.ex4.FrViewer;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ScrollPaneDemo extends JFrame {

    public ScrollPaneDemo() {
        super("JScrollPane Demo");
        Image image = null;
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home"));
        chooser.setDialogTitle("Abrir arquivo");
        chooser.setApproveButtonText("Abrir");
        int sf = chooser.showOpenDialog(null);
        if (sf == JFileChooser.APPROVE_OPTION) {
            try {
                image = ImageIO.read(chooser.getSelectedFile());
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
        System.out.println(image.getWidth(this));
        ImageIcon ii = new ImageIcon(image);
        JScrollPane jsp = new JScrollPane(new JLabel(ii));

        getContentPane().add(jsp);
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollPaneDemo();
    }
}
