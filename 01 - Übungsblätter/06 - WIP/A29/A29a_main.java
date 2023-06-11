import javax.swing.*;
import java.awt.*;

public class A29a_main extends JFrame {

    public A29a_main() {
        
        // Fenstertitel
        setTitle("Aufgabe29a");

        // Nordbereich
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.LIGHT_GRAY);
        JLabel label = new JLabel("Kontonummer");
        JTextField textField = new JTextField(20);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        northPanel.add(label);
        northPanel.add(textField);
        add(northPanel, BorderLayout.NORTH);

        // Südbereich
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.DARK_GRAY);
        JButton okButton = new JButton("Okay");
        JButton cancelButton = new JButton("Abbrechen");
        southPanel.add(okButton);
        southPanel.add(cancelButton);
        add(southPanel, BorderLayout.SOUTH);

        // Fenster schließen
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Fenstergröße und Sichtbarkeit
        setSize(500, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new A29a_main();
    }
}
