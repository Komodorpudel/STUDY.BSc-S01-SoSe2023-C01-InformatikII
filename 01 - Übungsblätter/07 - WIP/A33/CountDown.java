import javax.swing.JOptionPane;


public class CountDown {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Bitte geben Sie eine natürliche Zahl ein:");
        try {
            int number = Integer.parseInt(input);

            for (int i = number; i >= 1; i--) {
                JOptionPane.showMessageDialog(null, Integer.toString(i));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Bitte geben Sie eine gültige natürliche Zahl ein.");
        }
    }
}
