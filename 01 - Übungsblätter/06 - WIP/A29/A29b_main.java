import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A29b_main extends JFrame implements ActionListener {

    private JTextField displayField;

    public A29b_main() {
        // Fenstertitel
        setTitle("Aufgabe29b");

        // Oberer Bereich zur Anzeige der Eingabe
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.WHITE);
        topPanel.setPreferredSize(new Dimension(300, 100));
        displayField = new JTextField(20);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));
        displayField.setEditable(false);
        topPanel.add(displayField);
        add(topPanel, BorderLayout.NORTH);

        // Unterer Bereich mit Zahlen und Schaltflächen
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        // Tasten hinzufügen
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(this);
        JButton okayButton = new JButton("Okay");
        okayButton.addActionListener(this);

        buttonPanel.add(clearButton);
        buttonPanel.add(zeroButton);
        buttonPanel.add(okayButton);

        add(buttonPanel, BorderLayout.CENTER);

        // Fenster schließen
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Fenstergröße und Sichtbarkeit
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Clear".equals(command)) {
            displayField.setText("");
        } else if ("Okay".equals(command)) {
            // Hier können Sie die gewünschte Aktion für die Schaltfläche "Okay" definieren.
        } else {
            displayField.setText(displayField.getText() + command);
        }
    }

    public static void main(String[] args) {
        new A29b_main();
    }
}
