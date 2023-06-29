import java.io.*;
public class Program5
{
    private static int y;//global variable
    public void print()
    {
        int y=7;//local variable
        System.out.println("The local variableis: "+y);
    }
    public static void main(String[]args)
    {
        y=8;
        System.out.println("The global variable is: "+y);
    }
}