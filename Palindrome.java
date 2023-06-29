import java.io.*;
public class Palindrome
{
    public int count(int n)
    {
        int k=n;
        int c=0;
        while(k>0)
        {
            c++;
            k=k/10;
        }
        return c;
    }
    public void isPalind(int n)
    {
        int k=n;
        int num=0;
        while(k>0)
        {
            num+=(k%10);
            if(num==n && count(n)==count(num))
            {
                System.out.println("The number "+n+" is a palindrome number.");
            }
            else if(num!=n && count(n)==count(num))
            {
                System.out.println("The number "+n+" is not a palindrome number");
            }
            else
            {
                num*=10;
            }
            k=k/10;
        }
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Palindrome obj=new Palindrome();
        obj.isPalind(n);
    }
}