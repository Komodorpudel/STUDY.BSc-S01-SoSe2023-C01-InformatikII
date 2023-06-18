// Necessary packages/classes:
import javax.swing.JOptionPane;


public class CountDown {

    public CountDown() {
        String input = JOptionPane.showInputDialog("Bitte geben Sie eine natürliche Zahl ein:");
        int number = Integer.parseInt(input);

        for (int i = number; i >= 1; i--) {
            JOptionPane.showMessageDialog(null, String.valueOf(i));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountDown());
    }
}