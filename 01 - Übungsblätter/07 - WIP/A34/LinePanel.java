import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class LinePanel extends JPanel {
    private ArrayList<Point> points = new ArrayList<>();
    private Point currentPoint = null;

    public LinePanel() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                currentPoint = e.getPoint();
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                currentPoint = null;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }

        if (currentPoint != null && !points.isEmpty()) {
            Point last = points.get(points.size() - 1);
            g.drawLine(last.x, last.y, currentPoint.x, currentPoint.y);
        }
    }
}
