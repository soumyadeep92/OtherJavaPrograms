import java.util.HashMap;
import java.util.*;
public class Has
{  
    private float ar[];
    String str1=new String();
    List<String> h=new ArrayList<String>(100);
    HashMap<String,Double> hash=new HashMap<String,Double>();
    public void input() {
        hash.put("Yawn", 90.00);
        hash.put("No Yawn", 50.00);
        hash.put("Closed", 60.00);
        hash.put("Opened", 78.00);
    }
    public void predict() {
        String str = "Driver Yawing Detected";
        String stri=new String();
        double[] a = new double[hash.size()];
        double[] a1 = new double[hash.size()];
        int i = 0;
        Has obj=new Has();
        ArrayList<String> s=new ArrayList<String>(hash.size());
        ArrayList<String> str0=new ArrayList<String>(hash.size());
        for (Map.Entry m : hash.entrySet()) {
            Object d = m.getValue();
            Object d1=m.getKey();
            a[i] = (double) d;
            String s0=(String)d1;
            s.add(i,s0);
            //System.out.println(a[i]);
            i++;
        }
        i=0;
        while(i<hash.size()) {
            if(s.get(i)=="Yawn"||s.get(i)=="Closed")
            {
                a1[i]=a[i];
            }
            i++;
        }
        System.out.println(obj.print1());
        for(int j=0;j<str0.size();j++)
        {
            if(str0.get(j)!=null)
            {
                stri+=str0.get(j);
            }
        }
        for(int k=0;k<2;k++)
        {
            obj.h.add(stri);
        }
        for(int l=0;l<2;l++)
        {
            str1+=obj.h.get(l);
        }
    }
    public String print1()
    {
        return str1;
    }
    public double[] predict1()
    {
        String stri=new String();
        double[] a = new double[hash.size()];
        double[] a1 = new double[hash.size()];
        ar=new float[hash.size()];
        int i = 0;
        Has obj=new Has();        
        String[] s=new String[hash.size()];
        String[] str0=new String[hash.size()];        
        for (Map.Entry m : hash.entrySet()) {
            Object d1=m.getKey();
            String s0=(String)d1;
            Object d = m.getValue();
            a[i] = (double) d;
            s[i]=s0;
            //System.out.println(a[i]);
            i++;
        }
        i=0;
        while(i<hash.size()) {
            a1[i]=a[i];
            i++;
        }
        return a1;
    }
}