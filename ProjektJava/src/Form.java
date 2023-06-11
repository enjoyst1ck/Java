import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame implements ActionListener{

    private JButton logInButton;
    private JPasswordField passwordTextField;
    private JLabel logoLabel;
    private JTextField loginTextField;
    public Form() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,250);
        setTitle("Serwis Ogłoszeniowy");
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        Font mainFont = new Font("Arial", Font.BOLD, 20);
        Font textFieldFont = new Font("Arial", Font.BOLD, 18);

        logoLabel = new JLabel("Formularz logowania");
        logoLabel.setBounds(45, 10, 200, 25);
        logoLabel.setFont(mainFont);
        add(logoLabel);

        loginTextField = new JTextField("Login");
        loginTextField.setBounds(45, 45, 200, 25);
        loginTextField.setFont(textFieldFont);
        loginTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (loginTextField.getText().equals("Login")) {
                    loginTextField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (loginTextField.getText().isEmpty()) {
                    loginTextField.setText("Login");
                }
            }
        });
        add(loginTextField);

        passwordTextField = new JPasswordField("Hasło");
        passwordTextField.setBounds(45, 75, 200, 25);
        passwordTextField.setFont(textFieldFont);
        passwordTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (passwordTextField.getText().equals("Hasło")) {
                    passwordTextField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (passwordTextField.getText().isEmpty()) {
                    passwordTextField.setText("Hasło");
                }
            }
        });
        add(passwordTextField);


        logInButton = new JButton("Zaloguj");
        logInButton.setBounds(70,105,150,35);
        logInButton.setFont(textFieldFont);
        add(logInButton);
        logInButton.addActionListener(this);
    }





    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

