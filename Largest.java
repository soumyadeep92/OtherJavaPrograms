import java.io.*;
public class Largest
{
    public int largest(int i,int j,int k)
    {
        if(i>j && i>k)
        {
            return i;
        }
        else if(j>i && j>k)
        {
            return j;
        }
        else if(k>i && k>j)
        {
            return k;
        }
        else
        {
            System.out.println("Error....");
            return 0;
        }
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the three numbers: ");
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        int z=Integer.parseInt(br.readLine());
        Largest obj=new Largest();
        System.out.print("The largest number is: "+obj.largest(x,y,z));
    }
}