import java.io.*;
public class Odd_or_Even
{
    public boolean isOdd_or_isEven(int i)
    {
        if(i%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Odd_or_Even obj=new Odd_or_Even();
        System.out.println("Enter the number to check even or odd: ");
        int k=Integer.parseInt(br.readLine());
        if(obj.isOdd_or_isEven(k)==true)
        {
            System.out.println("The number "+k+" is even");
        }
        else
        {
            System.out.println("The number "+k+" is odd");
        }
    }
}