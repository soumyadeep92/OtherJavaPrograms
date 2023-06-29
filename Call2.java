public class Call2 implements Inter2
{
    public void printName()
    {
        System.out.println("My name is Soumya");
    }
    public void printNum(){}
    public static void main(String []args)
    {
        Call2 obj=new Call2();
        obj.printName();
        Inter2 obj1=new Call2();
        obj1.printName();
    }
}
 