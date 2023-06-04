import java.awt.event.*;
import javax.swing.*;

public class NoThreads extends JFrame implements ActionListener
{
    private JLabel textPlace;
    private JButton sendButton, exampleButton;

    public NoThreads() {
        setSize(400,310);
        setTitle("Formularz");
        setLayout(null);

        textPlace = new JLabel();
        textPlace.setBounds(10,20,200,20);
        add(textPlace);

        sendButton = new JButton("Wyślij");
        sendButton.setBounds(160,110,100,20);
        add(sendButton);
        sendButton.addActionListener(this);

        exampleButton = new JButton("Przycisk1");
        exampleButton.setBounds(240,200,100,20);
        add(exampleButton);
    }
    public void actionPerformed(ActionEvent e) {
        textPlace.setText("Rozpoczynam działanie.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        textPlace.setText("Działanie zakończone.");
    }


    public static void main(String[] args) {
        NoThreads aplikacja = new NoThreads();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }

}