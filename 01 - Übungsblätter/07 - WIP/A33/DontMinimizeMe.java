import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class DontMinimizeMe extends JFrame {

    private JPanel panel;

    public DontMinimizeMe() {
        setTitle("Don't minimize me!");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(1, 3));
        add(panel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                JButton button = new JButton("ouch");
                panel.add(button);
                panel.revalidate();
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                if (panel.getComponentCount() > 3) {
                    setTitle("Stop iconifying me");
                }
                if (panel.getComponentCount() > 6) {
                    setTitle("Dude, seriously, stop");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DontMinimizeMe frame = new DontMinimizeMe();
            frame.setVisible(true);
        });
    }
}