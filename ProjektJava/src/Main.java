import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Form gui = new Form();
            gui.setVisible(true);
        });
    }
}