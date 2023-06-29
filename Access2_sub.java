import java.io.*;
public class Access2_sub extends Access2
{
    public void meth()throws IOException
    {
        Access2_sub obj=new Access2_sub();
        obj.input();
        obj.print();
        System.out.println("The variable is: "+obj.m);
    }
    public static void main(String[]args)throws IOException
    {
        Access2_sub m=new Access2_sub();
        m.meth();
    }
}
 