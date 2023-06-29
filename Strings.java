import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
public class Strings
{
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void create()throws IOException
    {
        String s=new String();
        s=br.readLine();
        String s1="";
        s1+="abcd";
        String s3=" ";
        StringBuilder st=new StringBuilder("New");
        String s2=st.toString();
        char []arr={'a','b','c','d'};
        for(int i=0;i<arr.length;i++)
        {
            s3+=arr[i];
        }
        System.out.println("All the strings are: "+s+"  "+s1+"  "+s2+"  "+s3);
    }
    public void concatenate(String s)
    {
        String str=new String();
        System.out.println("Before concatenation: ");
        str=("My name is: " );
        System.out.println(str);
        System.out.println("After concatenation: ");
        str+=s;
        System.out.println(str);
    }
    public void len(String s)
    {
        int length=s.length();
        System.out.println("The length of the entered string is: "+length);
    }
    public void extract(String s)
    {
        System.out.println("The entered string is: "+s);
        String str=s.substring(2,s.length());
        System.out.println("The substring is: "+str);
    }
    public void search(String s)
    {
        System.out.println("Enter the character to be searched: ");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int i=0;
        for(;i<s.length();i++)
        {
            if(s.charAt(s.indexOf(c))==s.charAt(i))
            {
                System.out.println("The character is found at index "+i);
                break;
            }
            else
            {
                continue;
            }
        }
        if(i==s.length())
        {
            System.out.println("Character not found...");
        }
    }
    public void matching(String s)throws IOException
    {
        System.out.println("Enter a regular expression: ");
        String str=br.readLine();
        boolean b=Pattern.matches(s,str);
        if(b==true)
        {
            System.out.println("The strings match..");
        }
        else
        {
            System.out.println("The strings do not match..");
        }
    }
    public void equality(String s,String s1)
    {
       if(s.equals(s1)==true)
       {
           System.out.println("Both the strings are equal");
       }
       else
       {
           System.out.println("The strings are mismatched..");
       }
    }
    public void compare(String s)throws IOException
    {
        System.out.println("Enter a new string: ");
        String str=br.readLine();
        if(s.equalsIgnoreCase(str)==true)
        {
            System.out.println("Both the strings are equal irrespective of the case...");
        }
        if(s.startsWith("a")==true)
        {
            System.out.println("The string starts with the alphabet a");
        }
        if(s.endsWith("a")==true)
        {
            System.out.println("The string ends with the alphabet a");
        }
        if(s.compareTo(str)>0)
        {
            System.out.println("The mismatched character of string "+s+" is "+s.compareTo(str)+" times greater than the mismatched character of string "+str);
        }
        else if(s.compareTo(str)<0)
        {
            System.out.println("The mismatched character of string "+s+" is "+s.compareTo(str)+" times lesser than the mismatched character of string "+str);
        }
        else
        {
            System.out.println("Both the strings are equal..");
        }
    }
    public void trimming(String s)
    {
        String str=s.trim();
        System.out.println("The trimmed string is: "+str);
    }
    public void replacer(String s,int index)throws IOException
    {
        System.out.println("Enter the character to be replaced: ");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        String str=new String();
        for(int i=0;i<=s.length();i++)
        {
            if(i<index)
            {
                str+=s.charAt(i);
            }
            else if(i==index)
            {
                str+=c;
            }
            else
            {
                str+=s.charAt(i);
            }
        }
        System.out.println("The new String is: "+str);
    }
    public void splitter(String s)
    {
        System.out.println("The splitted string is: ");
        String []tr=s.split("\\s");
        for(int i=0;i<tr.length;i++)
        {
            System.out.println(tr[i]);
        }
    }
    public void convert(int q)
    {
        String s=Integer.valueOf(q).toString();
        System.out.println("The converted string is: "+s);
    }
    public void numbers()
    {
        Integer n=new Integer(9);
        String s=n.toString();
        System.out.println("The Integer is: "+n+"\nThe string is: "+s);
    }
    public void case_change(String s)
    {
        String str_lower=new String();
        String str_upper=new String();
        if(s!=null)
        {
            str_lower=s.toLowerCase();
            str_upper=s.toUpperCase();
        }
        System.out.println("The string in upper case: "+str_upper);
        System.out.println("The string in lower case: "+str_lower);
    }
    public static void main(String[]args)throws IOException
    {
        System.out.println("Enter the input string: ");
        String s=br.readLine();
        Strings obj=new Strings();
        obj.create();
        obj.concatenate(s);
        obj.len(s);
        obj.extract(s);
        obj.search(s);
        obj.matching(s);
        System.out.println("Enter the string to be compared: ");
        String s2=br.readLine();
        obj.equality(s,s2);
        obj.compare(s);
        obj.trimming(s);
        System.out.println("Enter the index: ");
        int in=Integer.parseInt(br.readLine());
        obj.replacer(s,in);
        obj.splitter(s);
        obj.convert(in);
        obj.numbers();obj.case_change(s);
    }
}