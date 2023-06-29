public class Test_sub
{
    public static void main(String[]args)
    {
        Other1 o=new Other1();
        Other1 obj=new Other1_sub();
        System.out.println("The value of m in parent calss is: "+o.m);
        System.out.println("The value of n in parent calss is: "+o.n);
        obj.use();
        System.out.println("The value of the string is: "+obj.s); 
    }
}