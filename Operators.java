import java.io.*;
public class Operators
{
    public void arithmetic(int a,int b)
    {
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        double div=a/b;
        int rem=a%b;
        System.out.println("The sum: "+sum+"\nThe difference: "+diff+"\nThe multiplication result: "+mul+"\nThe quotient is: "+div+"\nThe remainder is: "+rem);
    }
    public void incr_decr(int a, int b)
    {
        a++;
        b--;
        System.out.println("The increamented value is: "+a+"\nThe decreamented value is: "+b);
    }
    public void equal_notequals(int a, int b)
    {
        if(a==b)
        {
            System.out.println("Both the numbers are equal.");
        }
        else
        {
            System.out.println("Both the numbers are equal.");
        }
    }
    public void logic(int a,int b)
    {
        if(a==b && b>=0)
        {
            System.out.println("The numbers are equal and the second number is greater than zero");
        }
        else if(a>=0 || b<=0)
        {
            System.out.println("The first number is either positive or the second number is negative.");
        }
        else if(a!=b)
        {
            System.out.println("The numbers are not equal..");
        }
        else
        {
            System.out.println("FATAL ERROR!!!!!");
        }
    }
    public void relation(int a,int b)
    {
        if((a>=b || b<=0) && (a>=0 || b!=0))
        {
            System.out.println("Success in checking all the operators...");
        }
    }
    public void find(int a,int b)
    {
        if(a>b)
        {
            System.out.println("Number "+a+" is the largest number");
            System.out.println("Number "+b+" is the smallest number");
        }
        else if(b>a)
        {
           System.out.println("Number "+b+" is the largest number");
           System.out.println("Number "+a+" is the smallest number");
        } 
        else
        {
            System.out.println("Both the numbers are equal");
        }
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers: ");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        Operators obj=new Operators();
        obj.arithmetic(a,b);
        obj.incr_decr(a,b);
        obj.equal_notequals(a,b);
        obj.logic(a,b);
        obj.relation(a,b);
        obj.find(a,b);
    }
}
            