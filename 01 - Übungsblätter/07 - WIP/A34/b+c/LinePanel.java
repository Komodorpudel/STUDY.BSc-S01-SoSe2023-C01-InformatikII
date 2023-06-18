
// Implementieren Sie eine Zeichenfl¨ache LinePanel.java nach folgenden Vorgaben:
    // 1. Die Zeichenfl¨ache soll eine Gr¨oße von 300 × 300 Pixel vorziehen.
    // 2. Die Zeichenfl¨ache soll die Koordinaten jedes angeklickten Punktes in der Reihenfolge speichern, in der auf sie geklickt wurde.
    // 3. Die Zeichenfl¨ache soll die angeklickten Punkte in der Reihenfolge, in der Sie angeklickt wurden, mit Linien verbinden.
    // 4. H¨alt der Benutzer die Maustaste gedruckt, soll die Vorschau der Linie angezeigt wer- ¨den, die gezeichnet werden wurde, wenn die Maustaste jetzt losgelassen werden w ¨ urde

// Necessary packages/classes:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
//

class LinePanel extends JPanel {

    // --------------------------------------

    // Attribute
    private final List<Point> points;
    private Point previewPoint;

    // --------------------------------------
    
    // Konstruktor
    public LinePanel() {

        // 1. Die Zeichenfl¨ache soll eine Gr¨oße von 300 × 300 Pixel vorziehen.
        setPreferredSize(new Dimension(300, 300));

        // 2. Die Zeichenfl¨ache soll die Koordinaten jedes angeklickten Punktes in der Reihenfolge speichern, in der auf sie geklickt wurde.
        points = new ArrayList<>();
        previewPoint = null;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                points.add(e.getPoint());
                previewPoint = e.getPoint();
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                previewPoint = null;
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                previewPoint = e.getPoint();
                repaint();
            }
        });
    }

    // --------------------------------------

    // paintComponent
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 3. Die Zeichenfl¨ache soll die angeklickten Punkte in der Reihenfolge, in der Sie angeklickt wurden, mit Linien verbinden.
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }

        // 4. H¨alt der Benutzer die Maustaste gedruckt, soll die Vorschau der Linie angezeigt wer- ¨den, die gezeichnet werden wurde, wenn die Maustaste jetzt losgelassen werden w ¨ urde
        if (previewPoint != null && points.size() > 0) {
            Point lastPoint = points.get(points.size() - 1);
            g.setColor(Color.GRAY);
            g.drawLine(lastPoint.x, lastPoint.y, previewPoint.x, previewPoint.y);
        }
    }

    // --------------------------------------

    // main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Line Drawing");
            frame.add(new LinePanel());
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

    // --------------------------------------
}
