public class Program1
{
    private int i;
    public Program1()
    {
        i=1;
    }
    public void print()
    {
        System.out.println("The selected value is: "+i);
    }
    public static void main(String[]args)
    {
        Program1 obj=new Program1();
        obj.print();
    }
}