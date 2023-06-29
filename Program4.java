public class Program4
{
    public void print_Types()
    {
        int a=1;
        float b=3.24f;
        double c=1.24364645;
        boolean i=true;
        char j='s';
        String k="I love America";
        System.out.println("The integer value is: "+a);
        System.out.println("The float value is: "+b);
        System.out.println("The double value is: "+c);
        System.out.println("The boolean value is: "+i);
        System.out.println("The char value is: "+j);
        System.out.println("The string value is: "+k);
    }
    public static void main(String[]args)
    {
        Program4 obj=new Program4();
        obj.print_Types();
    }
}