import java.io.*;
public class Other1
{
    static int m;
    static int n;
    static String s;
    public Other1()
    {
        this.m=m;
        s="kolkata";
    }
    public Other1(int f)
    {
        n=f;
    }
    public void print()
    {
        m=9;
        System.out.println("The value of n without using this= "+n);
    }
    public void use()
    {
        this.s=s;
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Other1 obj=new Other1();
        n=Integer.parseInt(br.readLine());
        obj.print();
        System.out.println("The value of m using this method(only initialized): "+m);
        System.out.println("The value of m after assigning value: "+m);
        Other1 obj1=new Other1(m);
        System.out.println("The value of n is now: "+n);
        System.out.println("The string entered is: "+s);
    }
}        