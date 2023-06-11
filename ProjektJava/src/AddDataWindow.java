import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDataWindow extends JDialog implements ActionListener {

    private  JLabel categoryLabel, nameLabel, descriptionLabel, sellerLabel, contactLabel;
    private JTextField categoryTextField, nameTextField, descriptionTextField, sellerTextField, contactTextField;
    private JButton addDataButton;
    private MainForm form;
    public AddDataWindow(MainForm form) {
        this.form = form;

        setTitle("Serwis Ogłoszeniowy");
        setSize(400,310);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        categoryLabel = new JLabel("Kategoria: ");
        categoryLabel.setBounds(10,20,70,20);
        add(categoryLabel);

        nameLabel = new JLabel("Nazwa ");
        nameLabel.setBounds(10,50,70,20);
        add(nameLabel);

        descriptionLabel = new JLabel("Opis: ");
        descriptionLabel.setBounds(10,80,70,20);
        add(descriptionLabel);

        sellerLabel = new JLabel("Sprzedający: ");
        sellerLabel.setBounds(10,110,70,20);
        add(sellerLabel);

        contactLabel = new JLabel("Nr Telefonu (9 cyfr): ");
        contactLabel.setBounds(10,140,70,20);
        add(contactLabel);

        categoryTextField = new JTextField();
        categoryTextField.setBounds(110,20,157,20);
        add(categoryTextField);

        nameTextField = new JTextField();
        nameTextField.setBounds(110,50,157,20);
        add(nameTextField);

        descriptionTextField = new JTextField();
        descriptionTextField.setBounds(110,80,157,20);
        add(descriptionTextField);

        sellerTextField = new JTextField();
        sellerTextField.setBounds(110,110,157,20);
        add(sellerTextField);

        contactTextField = new JTextField();
        contactTextField.setBounds(110,140,157,20);
        add(contactTextField);

        addDataButton = new JButton("Dodaj");
        addDataButton.setBounds(160,170,105,20);
        add(addDataButton);
        addDataButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
