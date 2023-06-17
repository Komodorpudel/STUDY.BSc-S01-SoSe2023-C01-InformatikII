import javax.swing.JFrame;

public class LineFrame extends JFrame {

    private LinePanel linePanel;

    public LineFrame() {
        setTitle("Line Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        linePanel = new LinePanel();
        add(linePanel);

        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LineFrame frame = new LineFrame();
            frame.setVisible(true);
        });
    }
}