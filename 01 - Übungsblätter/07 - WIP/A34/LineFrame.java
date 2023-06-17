import javax.swing.JFrame;

public class LineFrame extends JFrame {
    
    public LineFrame() {
        setTitle("Line Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LinePanel linePanel = new LinePanel();
        linePanel.setPreferredSize(new java.awt.Dimension(300, 300));
        this.add(linePanel);
        this.pack();
    }
    
    public static void main(String[] args) {
        LineFrame frame = new LineFrame();
        frame.setVisible(true);
    }
}
