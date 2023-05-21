import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame implements ActionListener
{
    private JLabel nickLabel, sexLabel, firstNameLabel, secondNameLabel, emailLabel;
    private JTextField nickTextField, firstNameTextField, secondNameTextField, emailTextField;
    private JButton sendButton;
    private JRadioButton femaleRadioButton, maleRadioButton;
    boolean nickBool = false, firstNameBool = false, secondNameBool = false, emailBool = false, sexBool = false;
    public RegistrationForm() {
        setSize(400,310);
        setTitle("Registration Form");
        setLayout(null);


        nickLabel = new JLabel("Nick: ");
        nickLabel.setBounds(10,20,70,20);
        add(nickLabel);

        firstNameLabel = new JLabel("Imie: ");
        firstNameLabel.setBounds(10,50,70,20);
        add(firstNameLabel);

        secondNameLabel = new JLabel("Nazwisko: ");
        secondNameLabel.setBounds(10,80,70,20);
        add(secondNameLabel);

        emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(10,110,70,20);
        add(emailLabel);

        sexLabel = new JLabel("Płeć: ");
        sexLabel.setBounds(10,140,70,20);
        add(sexLabel);

        nickTextField = new JTextField();
        nickTextField.setBounds(110,20,157,20);
        add(nickTextField);

        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(110,50,157,20);
        add(firstNameTextField);

        secondNameTextField = new JTextField();
        secondNameTextField.setBounds(110,80,157,20);
        add(secondNameTextField);

        emailTextField = new JTextField();
        emailTextField.setBounds(110,110,157,20);
        add(emailTextField);

        femaleRadioButton = new JRadioButton("Kobieta");
        femaleRadioButton.setBounds(110,140,70,20);
        femaleRadioButton.setSelected(true);
        maleRadioButton = new JRadioButton("Mężczyzna");
        maleRadioButton.setBounds(180,140,105,20);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(femaleRadioButton);
        buttonGroup.add(maleRadioButton);

        getContentPane().add(femaleRadioButton);
        getContentPane().add(maleRadioButton);

        sendButton = new JButton("Wyślij");
        sendButton.setBounds(160,170,105,20);
        add(sendButton);
        sendButton.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){

    }
    public static void main(String[] args) {
        RegistrationForm app = new RegistrationForm();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}