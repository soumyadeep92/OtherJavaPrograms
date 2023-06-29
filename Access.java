import java.io.*;
public class Access
{
    private static int m;
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private static void input()throws IOException
    {
        System.out.println("Enter the number: ");
        m=Integer.parseInt(br.readLine());
    }
    private static void print()
    {
        System.out.println("The inputted number is: "+m);
    }
    public static void main(String []args)throws IOException
    {
        Access obj=new Access();
        obj.input();
        obj.print();
    }
}