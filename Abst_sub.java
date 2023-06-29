public class Abst_sub extends Abst
{
    public void temp()
    {
        System.out.println("This is the abstract method...");
    }
    public static void abs(Abst obj)
    {
        System.out.println("The object of the abstract class is invoked");
        obj.assume();
    }
    public static void main(String []args)
    {
        Abst o=new Abst_sub();
        abs(o);
        Abst_sub obj=new Abst_sub();
        obj.assume();
        obj.test();
        obj.temp();
    }
}