import java.io.*;
public class Switch
{
    public void Even_or_Odd(int n)
    {
        if(n>1)
        {
            switch(n%2)
            {
                case 0:
                    System.out.println("The number "+n+" is even");
                    break;
                case 1:
                    System.out.println("The number "+n+" is odd");
                    break;
                default:
                    break;
            }
        }
        else
        {
            System.out.println("The number "+n+" is neither even nor odd");
        }
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Switch obj=new Switch();
        obj.Even_or_Odd(n);
    }
}