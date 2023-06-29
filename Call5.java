public class Call5 implements Inter7
{
    public void difference(int a,int b)
    {
        int diff=a-b;
        System.out.println("The difference of "+a+" and "+b+" is: "+diff);
    }
    public static void main(String []args)
    {
        Call5 obj=new Call5();
        int a=88;
        int b=67;
        obj.difference(a,b);
    }
}