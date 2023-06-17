import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class LabelCreator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Creator");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel, BorderLayout.CENTER);

        JButton button = new JButton("Add new label");
        button.addActionListener(new LabelCreatorListener(panel));
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

class LabelCreatorListener implements java.awt.event.ActionListener {

    private JPanel panel;
    private Random random = new Random();

    public LabelCreatorListener(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date());

        JLabel label = new JLabel(time);
        label.setForeground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        panel.add(label);

        panel.revalidate();
        panel.repaint();
    }
}
