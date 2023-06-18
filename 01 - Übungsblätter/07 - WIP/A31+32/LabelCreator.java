// Necessary packages/classes:
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class LabelCreator extends JFrame {
    private JButton addButton;
    private JPanel panel;
    
    public LabelCreator() {
        setTitle("Label Creator");
        setSize(200, 200);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        addButton = new JButton("Add new label");
        addButton.addActionListener((ActionEvent e) -> addNewLabel());
        
        add(panel, BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);
    }
    
    private void addNewLabel() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String timeString = formatter.format(new Date());
        
        JLabel label = new JLabel(timeString);
        Random rand = new Random();
        label.setForeground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        
        panel.add(label);
        panel.revalidate();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LabelCreator frame = new LabelCreator();
            frame.setVisible(true);
        });
    }
}