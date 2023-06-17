import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhackNMoles extends JFrame {
    private int remainingButtons;

    public WhackNMoles(int numberOfButtons) {
        super("Whack " + numberOfButtons + " Moles!");
        remainingButtons = numberOfButtons;
        setLayout(new GridLayout(numberOfButtons / 3 + 1, 3));

        for (int i = 1; i <= numberOfButtons; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.addActionListener(e -> {
                button.setEnabled(false);
                remainingButtons--;
                if (remainingButtons == 0) {
                    dispose();
                }
            });
            add(button);
        }

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new WhackNMoles(9); // Beispiel: 9 Buttons
    }
}
