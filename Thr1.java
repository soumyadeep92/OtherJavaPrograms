import java.io.*;
public class Thr1 extends Thread
{
    public void start1()throws InterruptedException
    {
        Thread t=new Thread();
        System.out.println("Error");
        t.sleep(10000);
        System.out.println("Enter");
    }
    
}