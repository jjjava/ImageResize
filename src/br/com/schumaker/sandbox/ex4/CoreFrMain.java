package br.com.schumaker.sandbox.ex4;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author hudson.sales
 */
public class CoreFrMain {
    
    private static final CoreFrMain INSTANCE = new CoreFrMain();
    
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
                Image image = ImageIO.read(chooser.getSelectedFile());
                FrViewer viewer = FrViewer.getInstance();
                viewer.setVisible(true);
                viewer.draw(image);
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
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
