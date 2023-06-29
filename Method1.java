import java.io.*;
public class Method1
{
    public void name1(int n)
    {
        System.out.println("Count= "+n);
    }
    public void name1(int n,int m)
    {
        System.out.println("Count1= "+n+" Count2= "+m);
    }
    public void name2(String s)
    {
        System.out.println("The name is: "+s);
    }
    public void name2(String s1, int n)
    {
        System.out.println("Overloaded method...");
        System.out.println("Name= "+s1+" Count= "+n);
    }
    public void name3(int n)
    {
        System.out.println("The count= "+n);
    }
    public void name3(String m)
    {
        System.out.println("Overloaded method...");
        System.out.println("Name is= "+m);
    }
    public void name4(int m,String s)
    {
        System.out.println("Count= "+m);
        System.out.println("Name= "+s);
    }
    public void name4(String s,int m)
    {
        System.out.println("Overloaded method...");
        System.out.println("Count= "+m);
        System.out.println("Name= "+s);
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        Method1 obj=new Method1();
        obj.name1(n);
        obj.name1(n,m);
        obj.name2(s);
        obj.name2(s,m);
        obj.name3(n);
        obj.name3(s);
        //System.out.println("The returned value is: "+obj.name4(n));
        obj.name4(m,s);
        obj.name4(s,m);
    }
} 