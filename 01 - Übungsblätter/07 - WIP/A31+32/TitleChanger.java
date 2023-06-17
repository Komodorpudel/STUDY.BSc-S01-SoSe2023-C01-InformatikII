import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;


public class TitleChanger {

    public static void main(String[] args) {
        // Erstellen eines neuen Fensters (JFrame)
        JFrame frame = new JFrame("TitleChanger");
        frame.setSize(350, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Erstellen eines Panels mit einem 2x2 Grid-Layout zur Aufnahme der Buttons
        JPanel panel = new JPanel(new GridLayout(2, 2));

        // Erstellen der vier Buttons und Hinzufügen von Action-Listenern mit Lambda-Ausdrücken
        for (int i = 1; i <= 4; i++) {
            int buttonNumber = i;
            JButton button = new JButton("Button " + buttonNumber);
            button.addActionListener(e -> frame.setTitle("Title changed by Button " + buttonNumber));
            panel.add(button);
        }

        // Hinzufügen des Panels zum Fenster und Anzeigen des Fensters
        frame.add(panel);
        frame.setVisible(true);
    }
}
