import java.awt.event.*;
import javax.swing.*;

public class Form extends JFrame implements ActionListener, FocusListener
{
    private JLabel firstName, secondName, pesel, firstNameResult, secondNameResult,
            peselResult, birthDateResult, sexResult, controlNumberResult;
    private JTextField firstNameTextBox, secondNameTextBox, peselTextBox;
    private JButton sendButton, resetButton;
    private JCheckBox acceptCheckBox;
    public Form() {
        setSize(400,310);
        setTitle("Formularz");
        setLayout(null);

        firstName = new JLabel("Imie: ");
        firstName.setBounds(10,20,70,20);
        add(firstName);

        secondName = new JLabel("Nazwisko: ");
        secondName.setBounds(10,50,70,20);
        add(secondName);

        pesel = new JLabel("PESEL: ");
        pesel.setBounds(10,80,70,20);
        add(pesel);

        firstNameTextBox = new JTextField("Imie");
        firstNameTextBox.setBounds(110,20,150,20);
        firstNameTextBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (firstNameTextBox.getText().equals("Imie")) {
                    firstNameTextBox.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (firstNameTextBox.getText().isEmpty()) {
                    firstNameTextBox.setText("Imie");
                }
            }
        });
        add(firstNameTextBox);

        secondNameTextBox = new JTextField("Nazwisko");
        secondNameTextBox.setBounds(110,50,150,20);
        secondNameTextBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (secondNameTextBox.getText().equals("Nazwisko")) {
                    secondNameTextBox.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (secondNameTextBox.getText().isEmpty()) {
                    secondNameTextBox.setText("Nazwisko");
                }
            }
        });
        add(secondNameTextBox);

        peselTextBox = new JTextField("PESEL");
        peselTextBox.setBounds(110,80,150,20);
        peselTextBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (peselTextBox.getText().equals("PESEL")) {
                    peselTextBox.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (peselTextBox.getText().isEmpty()) {
                    peselTextBox.setText("PESEL");
                }
            }
        });
        peselTextBox.setToolTipText("Podaj numer PESEL.");
        add(peselTextBox);

        acceptCheckBox = new JCheckBox("Akceptuję Formularz");
        acceptCheckBox.setBounds(5, 110, 150,20);
        acceptCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    sendButton.setEnabled(true);
                }else {
                    sendButton.setEnabled(false);
                }
            }
        });
        add(acceptCheckBox);

        sendButton = new JButton("Wyślij");
        sendButton.setBounds(160,110,100,20);
        sendButton.setEnabled(false);
        add(sendButton);
        sendButton.addActionListener(this);

        resetButton = new JButton("Reset");
        resetButton.setBounds(270,110,100,20);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //resetForm();
            }
        });
        add(resetButton);

        firstNameResult = new JLabel("Imie");
        firstNameResult.setBounds(10,140,200,20);
        add(firstNameResult);

        secondNameResult = new JLabel("Nazwisko");
        secondNameResult.setBounds(10,160,200,20);
        add(secondNameResult);

        peselResult = new JLabel("PESEL");
        peselResult.setBounds(10,180,200,20);
        add(peselResult);

        birthDateResult = new JLabel("Data Urodzenia");
        birthDateResult.setBounds(10,200,200,20);
        add(birthDateResult);

        sexResult = new JLabel("Płeć");
        sexResult.setBounds(10,220,200,20);
        add(sexResult);

        controlNumberResult = new JLabel("Cyfra Kontrolna");
        controlNumberResult.setBounds(10,240,200,20);
        add(controlNumberResult);

        //setDisabledResultField();
    }
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        Form aplikacja = new Form();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }
    @Override
    public void focusGained(FocusEvent e) {}
    @Override
    public void focusLost(FocusEvent e) {}
}