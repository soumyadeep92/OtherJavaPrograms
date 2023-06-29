import java.io.*;
public class Construct
{
    private static int n;
    private static String str;
    private static int n0;
    public Construct()
    {
        n=9;
        n0=10;
        str="Soumya";
    }
    public Construct(int n1)
    {
        n=n1;
    }
    public Construct(int n1,int n2)
    {
        n=n1;
        n0=n2;
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Construct obj=new Construct();
        System.out.println("n= "+n+" n0= "+n0);
        int m=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        Construct obj1=new Construct(m);
        System.out.println("n= "+n+" n0= "+n0);
        Construct obj2=new Construct(m,k);
        System.out.println("n= "+n+" n0= "+n0);
        System.out.println("String= "+str);
    }
}