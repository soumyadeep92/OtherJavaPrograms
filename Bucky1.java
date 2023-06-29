import java.awt.*;
import java.awt.Graphics2D.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.io.*;
public class Bucky1
{
    public static void main(String args[])
    {
        Bucky1 b=new Bucky1();
        b.run();
    }
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
            a.update(timePassed);
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
        g.drawImage(a.getImage(),0,0,null);
    }
}