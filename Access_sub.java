import java.io.*;
public class Access_sub extends Access
{
    private void get_access(String []args)throws IOException
    {
        Access.main(args);
    }
    public static void main(String []args)throws IOException
    {
        Access_sub m=new Access_sub();        
        m.get_access(args);
    }
}