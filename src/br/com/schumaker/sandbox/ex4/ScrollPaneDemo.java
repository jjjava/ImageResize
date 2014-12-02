/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.sandbox.ex4;

/**
 *
 * @author hudson.sales
 */
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ScrollPaneDemo extends JFrame {

    public ScrollPaneDemo(Image image) {
        super("JScrollPane Demo esse!");
        ImageIcon ii = new ImageIcon(image);
        JScrollPane jsp = new JScrollPane(new JLabel(ii));
        getContentPane().add(jsp);
        setSize(300, 250);
        setVisible(true);
    }
}
