import java.io.*;
public class Access1
{
    int d;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void input()throws IOException
    {
        System.out.println("Enter the input number: ");
        d=Integer.parseInt(br.readLine());
    }
    void print()
    {
        System.out.println("The entered number is: "+d);
    }
    public static void main(String[]args)throws IOException
    {
        Access1 obj=new Access1();
        obj.input();
        obj.print();
        System.out.println("The accessed value is: "+obj.d);
    }
}   