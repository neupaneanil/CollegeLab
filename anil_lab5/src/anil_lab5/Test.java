package anil_lab5;
import java.awt.*;
import java.awt.event.*;

class Test extends Frame implements ActionListener {
    TextField textField;

    Test() {
        textField = new TextField();
        Button btn = new Button("click");

        btn.setBounds(500, 400,300, 200);
        textField.setBounds(100, 80, 70, 60);
        btn.addActionListener(this);
        add(btn);
        add(textField);
        btn.addActionListener(null);
            
        }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("I play games during class");
        System.out.println("anil");
    }

    public static void main(String[] args) {
        new Test();
    }
}

