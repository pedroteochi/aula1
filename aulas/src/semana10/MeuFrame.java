package semana10;

import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;

public class MeuFrame extends JFrame implements MouseListener{

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked!");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed!");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released!");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered!");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited!");
    }   

}
