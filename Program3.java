
/**
 * A program to print the boolean result of a signal function
 *
 * @author (Soumya Deep Das)
 * @version (using Java 11, 10/02/2021)
 */

//importing the packages
import java.io.*;
public class Program3
{
    // instance variables - x = 0 or 1, i.e a logic function
    private int x;

    /**
     * Constructor for objects of class Program3
     */
    public Program3()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Method isHighorLow to check whether the function is lowor high
     *
     * @param  y   is the input variable
     * @return    the boolean value true or false
     */
    public void isHighorLow(int y)
    {
        // returns true if x=y and false else
        if(y==0||y==1)
        {
            if(x!=y)
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
        }
        else
        {
            System.out.println("Error!!The value should be either 0 or 1");
        }
    }
    //declaring the main method
    public static void main(String[]args)throws IOException
    {
        //instantiating the class
        Program3 obj=new Program3();
        //taking the input
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int j=Integer.parseInt(br.readLine());
        System.out.println("The fuction result is: ");
        obj.isHighorLow(j);
    }
}
