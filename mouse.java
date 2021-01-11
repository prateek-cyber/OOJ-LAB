import java.awt.*;
import java.awt.event.*;
public class mouse extends Frame implements MouseListener, 
MouseMotionListener{
    String msg = "";
    int mouseX = 0, mouseY = 0;

    public mouse(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    public void mouseClicked(MouseEvent me){
        msg = msg + "click recieved";
        repaint();
    }
    public void mouseEntered(MouseEvent me){
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me){
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse Exited";
        repaint();
    }
    public void mousePressed(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "button down";
        repaint();
    }
    public void mouseReleased(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Released";
        repaint();
    }
    public void mouseDragged(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + "mouse at"+ mouseX +", " + mouseY;
        repaint();
    }
    public void mouseMoved(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + "moving mouse at"+ mouseX +", " + mouseY;
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }
    public static void main(String args[]){
         mouse appwin = new mouse();
         appwin.setSize(new Dimension(300, 300));
         appwin.setTitle("Mouse events");
         appwin.setVisible(true);
    }
}
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}