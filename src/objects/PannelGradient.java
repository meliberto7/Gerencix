package objects;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PannelGradient extends JPanel {

    private Color start = Color.green;
    private Color end = Color.blue;

    public Color getStart() {
        return start;
    }

    public void setStart(Color start) {
        this.start = start;
    }

    public Color getEnd() {
        return end;
    }

    public void setEnd(Color end) {
        this.end = end;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        GradientPaint gp = new GradientPaint(0, 0, start, height, width / 2, end);

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);

    }

}
