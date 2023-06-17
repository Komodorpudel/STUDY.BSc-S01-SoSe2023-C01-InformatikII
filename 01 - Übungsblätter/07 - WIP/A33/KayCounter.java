import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyCounter {

    private static int counter = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyCounter: 0");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'P' && e.isShiftDown()) {
                    counter += 10;
                } else if (e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
                    counter++;
                }
                frame.setTitle("KeyCounter: " + counter);
            }
        });

        frame.setFocusable(true);
        frame.setVisible(true);
    }
}
