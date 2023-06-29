public class Call4 implements Inter5,Inter6
{   
    public void printSame()
    {
        System.out.println("The methods are same in both the interfaces...");
    }
    public static void main(String []args)
    {
        Call4 obj=new Call4();
        obj.printSame();
    }
} 