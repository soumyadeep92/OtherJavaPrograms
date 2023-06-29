import java.io.*;
public class Program6
{
    private static String name;
    public Program6()
    {
        name=" ";
    }
    public void print()
    {
        System.out.print("My name is: "+name);
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        name=br.readLine();
        Program6 obj=new Program6();
        obj.print();
    }
}   