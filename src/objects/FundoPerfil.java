
package objects;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class FundoPerfil extends JPanel{
    
    
    private Color aStart = Color.BLACK;
    private Color aEnd = Color.WHITE;
    private Color aFundo = Color.black;

    public Color getaStart() {
        return aStart;
    }

    public void setaStart(Color aStart) {
        this.aStart = aStart;
    }

    public Color getaEnd() {
        return aEnd;
    }

    public void setaEnd(Color aEnd) {
        this.aEnd = aEnd;
    }

    public Color getaFundo() {
        return aFundo;
    }

    public void setaFundo(Color aFundo) {
        this.aFundo = aFundo;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D g2d2 = (Graphics2D) g;
        
        int largura = getWidth();
        int altura = getHeight();
        
        GradientPaint gp = new GradientPaint(0, 0, aStart, altura, largura / 2, aEnd);
        
        g2d2.setPaint(aFundo);
        g2d2.fillOval(-1, -1, altura + 2, largura + 2);
        
        g2d.setPaint(gp);
        g2d.fillOval(0, 0, altura, largura);
 
    }
    
    
    
}
