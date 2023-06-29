import java.awt.*;
import javax.swing.*;
import java.awt.Graphics2D.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.io.*;
import java.awt.event.*;
public class KeyTest extends Core implements KeyListener
{
    public static void main(String []args)
    {
        new KeyTest().run();
    }
    private String mess="";
    public void init()
    {
        super.init();
        Window w=s.getFullScreenWindow();
        w.setFocusTraversalKeysEnabled(false);
        w.addKeyListener(this);
        mess="press escape to exit";
    }
    public void keyPressed(KeyEvent e)
    {
        int keyCode=e.getKeyCode();
        if(keyCode==KeyEvent.VK_ESCAPE)
        {
            stop();
        }
        else
        {
            mess="Pressed : "+KeyEvent.getKeyText(keyCode);
            e.consume();
        }
    }
    public void keyReleased(KeyEvent e)
    {
        int keyCode=e.getKeyCode();
        mess="Released : "+KeyEvent.getKeyText(keyCode);
        e.consume();
    }
    public void keyTyped(KeyEvent e)
    {
        e.consume();
    }
    public synchronized void draw(Graphics2D g)
    {
        Window w=s.getFullScreenWindow();
        g.setColor(w.getBackground());
        g.fillRect(0,0,s.getWidth(),s.getHeigth());
        g.setColor(w.getForeground());
        g.drawString(mess,30,30);
    }
}