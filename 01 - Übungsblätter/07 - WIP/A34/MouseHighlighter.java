import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

public class MouseHighlighter extends JFrame {
    
    private int mouseX = -20;
    private int mouseY = -20;

    public MouseHighlighter() {
        setTitle("Mouse Highlighter");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawOval(mouseX - 15, mouseY - 15, 30, 30);
            }
        };

        panel.addMouseMotionListener(new MouseMotionListener() {
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                panel.repaint();
            }

            public void mouseDragged(MouseEvent e) {
            }
        });

        this.add(panel);
    }

    public static void main(String[] args) {
        MouseHighlighter frame = new MouseHighlighter();
        frame.setVisible(true);
    }
}
