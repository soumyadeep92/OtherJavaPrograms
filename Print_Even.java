public class Print_Even
{
    public void print()
    {
        int i=10;
        while(i<=100)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String []args)
    {
        Print_Even obj=new Print_Even();
        System.out.println("The even numbers in the range 10 to 100 are: ");
        obj.print();
    }
}