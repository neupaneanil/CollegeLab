package anil_lab5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Hello extends Frame implements ActionListener {
	TextField textfield;

	Hello() {

		textfield = new TextField();
		Button btn = new Button("click");

		btn.setBounds(100, 200, 50, 40);
		textfield.setBounds(60, 50, 70, 80);
		btn.addActionListener(this);

		add(btn);

	}

	private void add(Button btn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

	}

	public static void main(String[] args) {
		new Hello();
	}
}