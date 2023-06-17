import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhackNMoles extends JFrame {
    private int buttonCount;
    private int clickedButtons;
    private JButton[] buttons;
    
    public WhackNMoles(int numberOfButtons) {
        setTitle("Whack " + numberOfButtons + " Moles!");
        setSize(400, 200);
        setLayout(new GridLayout(0, 3));
        
        buttonCount = numberOfButtons;
        clickedButtons = 0;
        buttons = new JButton[buttonCount];
        
        for (int i = 0; i < buttonCount; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            int index = i;
            buttons[i].addActionListener(e -> {
                buttons[index].setEnabled(false);
                clickedButtons++;
                if (clickedButtons == buttonCount) {
                    dispose();
                }
            });
            add(buttons[i]);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WhackNMoles frame = new WhackNMoles(6);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}