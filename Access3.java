import java.io.*;
public class Access3
{
    protected int d;
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    protected void input()throws IOException
    {
        System.out.println("Enter the input: ");
        d=Integer.parseInt(br.readLine());
    }
    protected void print()
    {
        System.out.println("The entere dvariable is: "+d);
    }
    public static void main(String [] args)throws IOException
    {
        Access3 obj=new Access3();
        obj.input();
        obj.print();
        System.out.println("The accessed variable is: "+obj.d);
    }
}
 