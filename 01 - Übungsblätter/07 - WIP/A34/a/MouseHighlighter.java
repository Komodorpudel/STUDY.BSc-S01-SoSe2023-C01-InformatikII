// Necessary packages/classes:
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

public class MouseHighlighter extends JFrame {

    private Point mousePoint;

    public MouseHighlighter() {
        setTitle("Mouse Highlighter");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mousePoint = new Point(0, 0);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mousePoint = e.getPoint();
                repaint();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mousePoint = e.getPoint();
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(mousePoint.x - 15, mousePoint.y - 15, 30, 30);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseHighlighter frame = new MouseHighlighter();
            frame.setVisible(true);
        });
    }
}