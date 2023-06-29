import java.io.*;
public class Call3 implements Inter3,Inter4
{
    public void printReal()
    {
        System.out.println("The numbers is real...");
    }
    public int real(int n)
    {
        return n;
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int y=Integer.parseInt(br.readLine());
        Call3 obj=new Call3();
        System.out.println("The number is: "+obj.real(y));
        obj.printReal();
    }
}