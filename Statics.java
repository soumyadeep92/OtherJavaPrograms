import java.io.*;
public class Statics
{
    private static int st_var1;
    private static int st_var2;
    private int inst_var1;
    private int inst_var2;
    public Statics()
    {
        st_var1=1;
        st_var2=2;
    }
    public Statics(int i1,int i2)
    {
        inst_var1=i1;
        inst_var2=i2;
    }
    public static void print_stat(int ix,int iy)
    {
        Statics obj=new Statics(ix,iy);
        System.out.println("The instance variable 1: "+obj.inst_var1);
        System.out.println("The instance variable 2: "+obj.inst_var2);
    }
    public void print_inst()
    {
        System.out.println("The static variable 1: "+st_var1);
        System.out.println("The static variable 2: "+st_var2);
    }
    public void call_stat()
    {
        print_stat(inst_var1,inst_var2);
    }
    public static void call_inst()
    {
        Statics obj=new Statics();
        obj.print_inst();
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Statics obj=new Statics();
        System.out.println("Enter the non-satic inputs: ");
        int i=Integer.parseInt(br.readLine());
        int j=Integer.parseInt(br.readLine());
        System.out.println("The static functions are: ");
        print_stat(i,j);
        call_inst();
        System.out.println("The instance functions are: ");
        obj.print_inst();
        obj.call_stat();
    }
}    