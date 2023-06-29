public class Number
{
    public void large()
    {
        int a=10,b=20,c=30;
        if(a>b && a>c)
        {
            System.out.println("The number "+a+" is largest");
        }
        else if(b>a && b>c)
        {
            System.out.println("The number "+b+" is largest");
        }
        else if(c>a && c>b)
        {
            System.out.println("The number "+c+" is largest");
        }
        else
        {
            System.out.println("Error!!");
        }
    }
    public static void main(String []args)
    {
        Number obj=new Number();
        obj.large();
    }
}
 