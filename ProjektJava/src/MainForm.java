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
                deleteData();
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
        showDataFromDatabase();
    }

    public void showDataFromDatabase(){
        DatabaseConnection newConnection = new DatabaseConnection();
        try {
            newConnection.connect();
            String databaseQuery = "SELECT * FROM ogloszenia";
            Statement statement = newConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(databaseQuery);

            tableModel.setRowCount(0);
            while (resultSet.next()){
                int id = resultSet.getInt("Id_ogloszenia");
                String category = resultSet.getString("Kategoria");
                String name = resultSet.getString("Nazwa");
                String description = resultSet.getString("Opis");
                String seller = resultSet.getString("Sprzedajacy");
                int contact = resultSet.getInt("Kontakt");

                Object[] rowData = {id, category, name, description, seller, contact};
                tableModel.addRow(rowData);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        newConnection.disconnect();
    }
    public void deleteData(){
        Object idToDelete = tableToData.getValueAt(tableToData.getSelectedRow(), 0);
        int rowToDelete = (int) idToDelete;
        DatabaseConnection newConnection = new DatabaseConnection();
        try {
            newConnection.connect();
            String databaseQuery = "DELETE FROM ogloszenia WHERE Id_ogloszenia = ?";
            PreparedStatement statement = newConnection.getConnection().prepareStatement(databaseQuery);
            statement.setInt(1, rowToDelete);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Usunięto ogłoszenie.");
            showDataFromDatabase();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Nie udało się usunąć ogłoszenia.");
            throw new RuntimeException(ex);
        }
        newConnection.disconnect();
    }

    public void openDataEntryDialog(){
        AddDataWindow addDataWindow = new AddDataWindow(this);
        addDataWindow.setModal(true);
        addDataWindow.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}

