/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.sandbox.ex2;

/**
 *
 * @author hudson.sales
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

    @Override
    public void paint(Graphics g) {
        Image img1 = Toolkit.getDefaultToolkit().getImage("yourFile.gif");

        int width = img1.getWidth(this);
        int height = img1.getHeight(this);

        int scale = 2;
        int w = scale * width;
        int h = scale * height;
        // explicitly specify width (w) and height (h)
        g.drawImage(img1, 10, 10, (int) w, (int) h, this);

    }
}

public class Graphics2DDrawScaleImage {

    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);
    }
}
