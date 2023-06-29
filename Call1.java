import java.io.*;
public class Call1 implements Inter1
{
    public int find(int m, int y)
    {
        if(m!=y)
        {
            return 0;
        }
        else
        {
            return m;
        }
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        int o=Integer.parseInt(br.readLine());
        Call1 obj=new Call1();
        System.out.println("The found number is: "+obj.find(m,o));
    }
}