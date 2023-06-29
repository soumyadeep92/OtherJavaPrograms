import java.io.*;
public class Access2
{
    public int m;
    private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void input()throws IOException
    {
        System.out.println("Enter the input number: ");
        m=Integer.parseInt(br.readLine());
    }
    public void print()
    {
        System.out.println("The entered number is: "+m);
    }
    public static void main(String[]args)throws IOException
    {
        Access1 obj=new Access1();
        obj.input();
        obj.print();
        System.out.println("The accessed value is: "+obj.d);
    }
}   