import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;


public class TitleChanger extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    
    public TitleChanger() {
        setTitle("TitleChanger");
        setSize(350, 100);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button1 = new JButton("Button 1");
        button1.addActionListener((ActionEvent e) -> setTitle("Title changed by Button 1"));
        
        button2 = new JButton("Button 2");
        button2.addActionListener((ActionEvent e) -> setTitle("Title changed by Button 2"));
        
        button3 = new JButton("Button 3");
        button3.addActionListener((ActionEvent e) -> setTitle("Title changed by Button 3"));
        
        button4 = new JButton("Button 4");
        button4.addActionListener((ActionEvent e) -> setTitle("Title changed by Button 4"));
        
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TitleChanger frame = new TitleChanger();
            frame.setVisible(true);
        });
    }
}
