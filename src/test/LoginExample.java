package test;

import javax.swing.*;
import java.awt.event.*;

class NewFrame extends JFrame {
    JLabel welcome = new JLabel("Welcome to the world!");
    JPanel panel = new JPanel();

    NewFrame() {
        setSize(300, 200);
        setLocation(500, 280);
        panel.setLayout(null);

        welcome.setBounds(70, 50, 150, 60);

        panel.add(welcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class LoginExample extends JFrame {
    JButton button = new JButton("Submit");
    JPanel panel = new JPanel();
    JTextField textField = new JTextField(15);
    JPasswordField jPasswordField = new JPasswordField(15);
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();

    LoginExample() {

        super("Autentification");
        label.setText("Username:");
        label2.setText("Password:");

        setSize(300, 200);
        setLocation(500, 280);
        panel.setLayout(null);
        label.setBounds(10, 30, 100, 20);
        label2.setBounds(10, 65, 100, 20);
        textField.setBounds(80, 30, 150, 20);
        jPasswordField.setBounds(80, 65, 150, 20);
        button.setBounds(110, 100, 80, 20);

        panel.add(label);
        panel.add(label2);
        panel.add(button);
        panel.add(textField);
        panel.add(jPasswordField);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionLogin();
    }

    public void actionLogin() {
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = textField.getText();
                String pwd = String.valueOf(jPasswordField.getPassword());
				
                if (name.equals("1") && pwd.equals("123")) {
                    NewFrame regFace = new NewFrame();
                    regFace.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Welcome!");
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null, "wrong");
                    textField.setText("");
                    jPasswordField.setText("");
                    textField.requestFocus();
                }

            }
        });
    }

    public static void main(String[] args) {
        LoginExample frame = new LoginExample();
    }
}