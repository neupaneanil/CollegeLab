package JavaCoding;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FirstSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		JButton tfone = new JButton();
		tfone.setBounds(10, 10, 100, 30);
		frame.add(tfone);

		JButton tftwo = new JButton();
		tftwo.setBounds(120, 10, 100,30 );
		frame.add(tftwo);

    JButton btn = new JButton();
	btn.setBounds(230, 10, 100, 30);
	frame.add(btn);

		

		JButton tfthree = new JButton();
		frame.add(tfthree);
		tfthree.setBounds(10, 50, 100, 30);

		frame.setSize(350, 170);
		frame.setVisible(true);
		
		JButton tffour = new JButton();
		frame.add(tffour);
		tffour.setBounds(120, 50, 100, 30);
		
		
		JButton tffive = new JButton();
		frame.add(tffive);
		tffive.setBounds(230, 50, 100, 30);
		
		
		JButton tfsix = new JButton();
		frame.add(tfsix);
		tfsix.setBounds(10, 90, 100, 30);
		
		JButton tf7 = new JButton();
		frame.add(tf7);
		tf7.setBounds(120, 90, 100, 30);
		
		JButton tf8 = new JButton();
		frame.add(tf8);
		tf8.setBounds(230, 90, 100, 30);
		
		JButton tf9 = new JButton();
		frame.add(tf9);
		tf9.setBounds(10, 130,100, 30);
		

	}

}
