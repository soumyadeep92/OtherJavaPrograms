import java.io.*;
import java.util.Scanner;
public class Gender
{
    public void isM_or_isF(char n)
    {
        switch(n)
        {
            case 'M':
                System.out.println("The gender is Male.");
                break;
            case 'F':
                System.out.println("The gender is Female.");
                break;
            default:
                System.out.println("Error!!!");
                break;
        }
    }
    public static void main(String []args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        Gender obj=new Gender();
        obj.isM_or_isF(c);
    }
}