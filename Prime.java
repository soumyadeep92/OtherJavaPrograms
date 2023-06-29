import java.io.*;
public class Prime
{
    public void isPrime(int n)
    {
        int k=n;
        int g=2;
        if(n==1)
        {
            System.out.println("The number 1 is not prime");
        }
        while(k>0)
        {
            while(g<k)
            {
                if(k%g==0)
                {
                    k=0;
                    System.out.println("The number "+n+" is not prime");
                }
                g++;
            }
        }
        if(k!=0 && g==k)
        {
            System.out.println("The number "+n+" is prime");
        }
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n=Integer.parseInt(br.readLine());
        Prime obj=new Prime();
        obj.isPrime(n);
    }
}
 