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
        String nick = nickTextField.getText();
        try {
            checkNick(nick);
            nickBool = true;
        }catch (NickException mess){
            nickBool = false;
            JOptionPane.showMessageDialog(null, mess.getMessage());
        }

        String firstName = firstNameTextField.getText();
        try{
            checkFirstName(firstName);
            firstNameBool = true;
        }catch (FirstSecondNameException mess){
            firstNameBool = false;
            JOptionPane.showMessageDialog(null, "Imie " + mess.getMessage());
        }

        String secondName = secondNameTextField.getText();
        try{
            checkSecondName(secondName);
            secondNameBool = true;
        }catch (FirstSecondNameException mess){
            secondNameBool = false;
            JOptionPane.showMessageDialog(null, "Nazwisko " + mess.getMessage());
        }

        String email = emailTextField.getText();
        try{
            checkEmail(email);
            emailBool = true;
        }catch (EmailException mess){
            emailBool = false;
            JOptionPane.showMessageDialog(null, mess.getMessage());
        }

        String sex = "";
        if(femaleRadioButton.isSelected()){
            sex = "Kobieta";
        }else if(maleRadioButton.isSelected()){
            sex = "Mężczyzna";
        }
        try{
            checkSex(sex, firstName);
            sexBool = true;
        }catch (SexException mess){
            sexBool = false;
            JOptionPane.showMessageDialog(null, mess.getMessage());
        }

        if(nickBool && firstNameBool && secondNameBool && emailBool && sexBool) {
            JOptionPane.showMessageDialog(null, "Formularz poprawny");
            resetForm();
        }
    }

    static void checkNick(String nick) throws NickException{
        if(nick.length() < 6 || !nick.matches(".*\\d.*")){
            throw new NickException(nick);
        }
    }

    static void checkFirstName(String firstName) throws FirstSecondNameException {
        if(firstName.length() == 0 || !firstName.matches("[A-Z][a-zA-Z]*")){
            throw new FirstSecondNameException(firstName);
        }
    }

    static void checkSecondName(String secondName) throws FirstSecondNameException {
        if(secondName.length() == 0 || !secondName.matches("[A-Z][a-zA-Z]*")){
            throw new FirstSecondNameException(secondName);
        }
    }

    static void checkEmail(String email) throws EmailException{
        if(email.length() == 0 || !email.endsWith("@gra.pl")){
            throw new EmailException(email);
        }
    }

    static void checkSex(String sex, String firstName) throws SexException{
        if((firstName.endsWith("ek") || firstName.endsWith("usz")) && sex == "Kobieta"){
            throw new SexException(sex);
        }
        if((firstName.endsWith("ta") || firstName.endsWith("na")) && sex == "Mężczyzna"){
            throw new SexException(sex);
        }
    }

    public void resetForm(){
        nickTextField.setText("");
        firstNameTextField.setText("");
        secondNameTextField.setText("");
        emailTextField.setText("");
        femaleRadioButton.setSelected(true);
        nickBool = false;
        firstNameBool = false;
        secondNameBool = false;
        emailBool = false;
        sexBool = false;
    }

    public static void main(String[] args) {
        RegistrationForm app = new RegistrationForm();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}