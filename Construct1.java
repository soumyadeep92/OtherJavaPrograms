import java.io.*;
public class Construct1
{
    private static String a;
    private static String b;
    private Construct1()
    {
        a="private access";
    }
    protected Construct1(String s)
    {
        a=s;
    }
    Construct1(String c,String b1)
    {
        a=c;
        System.out.println("Default Constructor");
        b=b1;
    }
    public static void main(String []args)throws IOException
    {
        Construct1 obj=new Construct1();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        System.out.println(a);
        Construct1 obj1=new Construct1(s1);
        System.out.println(b);
        Construct1 obj2=new Construct1(s1,s2);
        System.out.println(a);
        System.out.println(b);
    }
}