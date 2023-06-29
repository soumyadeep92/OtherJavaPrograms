import java.io.*;
public class Armstrong
{
    public boolean isArmstrong(int n)
    {
        int k=n;
        int y=1;
        int sum=0;
        while(k>0)
        {
            y=k%10;
            sum+=Math.pow(y,3);
            k=k/10;
        }  
        if(sum==n)
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
        System.out.println("Enter the number: ");
        int k=Integer.parseInt(br.readLine());
        Armstrong obj=new Armstrong();
        if(obj.isArmstrong(k)==true)
        {
            System.out.println("The number "+k+" is an armstrong number");
        }
        else
        {
            System.out.println("The number "+k+" is not an armstrong number");
        }
    }
} 