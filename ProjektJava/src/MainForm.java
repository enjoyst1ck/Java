import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MainForm extends JDialog implements ActionListener{
    private JButton addDataButton, deleteDataButton;
    private JTable tableToData;
    private DefaultTableModel tableModel;
    public MainForm(Form form) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700,500);
        setTitle("Serwis Ogłoszeniowy");
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        Font mainFont = new Font("Arial", Font.BOLD, 20);

        tableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tableModel.addColumn("Id_ogloszenia");
        tableModel.addColumn("Kategoria");
        tableModel.addColumn("Nazwa");
        tableModel.addColumn("Opis");
        tableModel.addColumn("Sprzedajacy");
        tableModel.addColumn("Kontakt");

        tableToData = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableToData);
        scrollPane.setBounds(10,10,670,200);
        add(scrollPane);

        addDataButton = new JButton("Dodaj ogłoszenie");
        addDataButton.setBounds(10,250,200,35);
        addDataButton.setFont(mainFont);
        add(addDataButton);
        addDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDataEntryDialog();
            }
        });

        deleteDataButton = new JButton("Usuń ogłoszenie");
        deleteDataButton.setBounds(480,250,200,35);
        deleteDataButton.setFont(mainFont);
        add(deleteDataButton);
        deleteDataButton.setEnabled(false);
        deleteDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        tableToData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tableToData.getSelectedRow() >= 0){
                    deleteDataButton.setEnabled(true);
                }else {
                    deleteDataButton.setEnabled(false);
                }
            }
        });

    }

    public void openDataEntryDialog(){
        AddDataWindow addDataWindow = new AddDataWindow(this);
        addDataWindow.setModal(true);
        addDataWindow.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}

