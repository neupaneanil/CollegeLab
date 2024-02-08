package day5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton tfone = new JButton("Button 1");
        tfone.setBounds(10, 10, 100, 30);
        frame.add(tfone);

        JButton tftwo = new JButton("Button 2");
        tftwo.setBounds(120, 10, 100, 30);
        frame.add(tftwo);

        JButton btn = new JButton("Button 3");
        btn.setBounds(230, 10, 100, 30);
        frame.add(btn);

       JButton tfthree = new JButton("Button 4");
        tfthree.setBounds(10, 50, 100, 30);
        frame.add(tfthree);

        JButton tffour = new JButton("Button 5");
        tffour.setBounds(120, 50, 100, 30);
        frame.add(tffour);

        JButton tffive = new JButton("Button 6");
        tffive.setBounds(230, 50, 100, 30);
        frame.add(tffive);

        JButton tfsix = new JButton("Button 7");
        tfsix.setBounds(10, 90, 100, 30);
        frame.add(tfsix);

        JButton tf7 = new JButton("Button 8");
        tf7.setBounds(120, 90, 100, 30);
        frame.add(tf7);

        JButton tf8 = new JButton("Button 9");
        tf8.setBounds(230, 90, 100, 30);
        frame.add(tf8);

        frame.setSize(350, 170); // Adjusted frame size
        frame.setLayout(null); // Set layout to null for absolute positioning
        frame.setVisible(true);
    }
}
