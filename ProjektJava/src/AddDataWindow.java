import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDataWindow extends JDialog implements ActionListener {

    private MainForm form;
    public AddDataWindow(MainForm form) {
        this.form = form;

        setTitle("Serwis Ogłoszeniowy");
        setSize(400,310);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
