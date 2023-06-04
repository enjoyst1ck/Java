import java.awt.event.*;
import javax.swing.*;

public class WithThreads extends JFrame
{
    private JLabel textPlace;
    private JButton sendButton, exampleButton;

    public WithThreads() {
        setSize(400,310);
        setTitle("Formularz");
        setLayout(null);

        textPlace = new JLabel();
        textPlace.setBounds(10,20,200,20);
        add(textPlace);

        sendButton = new JButton("Wyślij");
        sendButton.setBounds(160,110,100,20);
        add(sendButton);
        sendButton.addActionListener(e -> {
            Thread thread = new Thread(() -> operation());
            thread.start();
        });

        exampleButton = new JButton("Przycisk");
        exampleButton.setBounds(160,200,100,20);
        add(exampleButton);

    }
    public void operation() {
        textPlace.setText("Rozpoczynam działanie.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        textPlace.setText("Działanie zakończone.");
    }
    public static void main(String[] args) {
        WithThreads aplikacja = new WithThreads();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }

}