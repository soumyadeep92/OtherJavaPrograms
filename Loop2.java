public class Loop2
{
    public void print()
    {
        int i=0;
        while(i<20)
        {
            ++i;
            System.out.println(i);
        }
    }
    public static void main(String[]args)
    {
        Loop2 obj=new Loop2();
        obj.print();
    }
}