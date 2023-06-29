public class Inherit
{
    public static void main(String []args)
    {
        A obj1=new A();
        B obj2=new B();
        C obj3=new C();
        obj1.printHello();
        obj2.sayHello();
        obj3.Hello();
        obj1.printHi();
        obj2.printHi();
        obj3.printHi();
        System.out.println("The value of n in C: "+obj3.n);
        System.out.println("The value of n in A: "+obj1.n);
        System.out.println("The value of n in B: "+obj2.n);
    }
}