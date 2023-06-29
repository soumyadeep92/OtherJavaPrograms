public class Do_While
{
    public void print()
    {
        int i=0;
        do
        {
            ++i;
            System.out.println(i);
        }while(i>10);
    }
    public static void main(String []args)
    {
        Do_While obj=new Do_While();
        obj.print();
    }
}

        