import java.awt.*;
import java.awt.Graphics2D.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.*;
public class Bucky2
{
    public static void main(String args[])
    {
        Bucky1 b=new Bucky1();
        b.run();
    }
    private Sprite sprite;
    private Animation a;
    private ScreenManager s;
    private Image bg;
    private static final DisplayMode mode1[]={new DisplayMode(800,600,32,0),new DisplayMode(800,600,16,0),new DisplayMode(640,480,32,0),new DisplayMode(640,480,24,0),new DisplayMode(640,480,16,0),};
    public void loadImages()
    {
        bg=new ImageIcon("E:\\BlueJ\\bluej\\icons\\bluej-84-toned").getImage();
        Image face1=new ImageIcon("E:\\BlueJ\\bluej\\icons\\bluej-84-toned").getImage();
        Image face2=new ImageIcon("E:\\BlueJ\\bluej\\icons\\bluej-84-toned").getImage();
        a=new Animation();
        a.addScene(face1,250);
        a.addScene(face2,250);
        sprite=new Sprite(a);
        sprite.setVelocityX(0.3f);
        sprite.setVelocityY(0.3f);
    }
    public void run()
    {
        s=new ScreenManager();
        try
        {
            DisplayMode dm=s.findFirstCompatibleMode(mode1);
            s.setFullScreen(dm);
            loadImages();
            movieLoop();
        }
        finally
        {
            s.restoreScreen();
        }
    }
    public void movieLoop()
    {
        long startingTime=System.currentTimeMillis();
        long cumTime=startingTime;
        while(cumTime-startingTime<6000)
        {
            long timePassed=System.currentTimeMillis()-cumTime;
            cumTime+=timePassed;
            update(timePassed);
            Graphics2D g=s.getGraphics();
            draw(g);
            g.dispose();
            s.update();
            try
            {
                Thread.sleep(20);
            }
            catch(Exception e){}
        }
    }
    public void draw(Graphics g)
    {
        g.drawImage(bg,0,0,null);
        g.drawImage(sprite.getImage(),Math.round(sprite.getX()),Math.round(sprite.getY()),null);
    }
    public void update(long timePassed)
    {
        if(sprite.getX()<0)
        {
            sprite.setVelocityX(Math.abs(sprite.getVelocityX()));
        }
        else if(sprite.getX()+sprite.getWidth()>=s.getWidth())
        {
            sprite.setVelocityX(-Math.abs(sprite.getVelocityX()));
        }
        if(sprite.getY()<0)
        {
            sprite.setVelocityY(Math.abs(sprite.getVelocityY()));
        }
        else if(sprite.getY()+sprite.getHeight()>=s.getHeigth())
        {
            sprite.setVelocityY(-Math.abs(sprite.getVelocityY()));
        }
        sprite.update(timePassed);
    }
}