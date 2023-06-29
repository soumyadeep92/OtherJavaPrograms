public class Operator
{
    public void isEqual(int i,int j)
    {
        if(i==j)
        {
            System.out.println("Equal...");
        }
        else if(i>=j)
        {
            System.out.println("Not Equals.....Greater than");
        }
        else if(i<=j)
        {
            System.out.println("Not Equals.....Lesser than");
        }
        else
        {
            System.out.println("FATAL ERROR!!!!!NO CALCULATIONS POSSIBLE");
        }
    }
    public static void main(String []args)
    {
        int i=30;
        int j=90;
        Operator obj=new Operator();
        obj.isEqual(i,j);
    }
}