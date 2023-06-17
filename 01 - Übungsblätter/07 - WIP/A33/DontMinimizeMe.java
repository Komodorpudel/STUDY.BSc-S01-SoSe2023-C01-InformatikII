import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class DontMinimizeMe {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Don't minimize me!");
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(0, 3));
        frame.add(panel);

        frame.addWindowListener(new WindowAdapter() {
            public void windowIconified(WindowEvent e) {
                JButton button = new JButton("ouch");
                panel.add(button);
                frame.pack();
            }

            public void windowDeiconified(WindowEvent e) {
                if (panel.getComponentCount() > 3) {
                    frame.setTitle("Stop iconifying me");
                }
                if (panel.getComponentCount() > 6) {
                    frame.setTitle("Dude, seriously, stop");
                }
            }
        });

        frame.setVisible(true);
    }
}
