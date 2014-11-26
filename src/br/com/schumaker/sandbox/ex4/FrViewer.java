package br.com.schumaker.sandbox.ex4;

import java.awt.Canvas;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author hudson.sales
 */
public class FrViewer extends javax.swing.JFrame {

    private static final FrViewer INSTANCE = new FrViewer();
    private JScrollPane jsp;

    private FrViewer() {
        this.initComponents();
    }

    public static FrViewer getInstance() {
        return INSTANCE;
    }

    public void draw(Image image) {
         System.out.println(image.getWidth(this));
        ImageIcon ii = new ImageIcon(image);
        jsp = new JScrollPane(new JLabel(ii));
        getContentPane().add(jsp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
