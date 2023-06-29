public class Call6 implements Inter10
{
    public void printd(Call6 obj)
    {
        int s=obj.d;
        System.out.println("The value of d is: "+s);
    }
    public void printf(Call6 obj)
    {
        int s=obj.f;
        System.out.println("The value of f is: "+s);
    }
    public static void main(String []args)
    {
        Call6 obj=new Call6();
        obj.printd(obj);
        obj.printf(obj);
    }
}   