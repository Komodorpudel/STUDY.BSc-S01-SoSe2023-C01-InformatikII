import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyCounter extends JFrame {

    private int count;

    public KeyCounter() {
        setTitle("KeyCounter: 0");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        count = 0;

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'P' && e.isShiftDown()) {
                    count += 10;
                } else if (e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
                    count += 1;
                }
                setTitle("KeyCounter: " + count);
            }
        });
        setFocusable(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyCounter frame = new KeyCounter();
            frame.setVisible(true);
        });
    }
}