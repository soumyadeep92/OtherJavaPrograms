import java.io.*;
public class Array
{
    private int size;
    private int arr[];
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public Array(int s)
    {
        size=s;
        arr=new int[size];
    }
    public void input()throws IOException
    {
        for(int i=0;i<size;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    public void print()
    {
        System.out.println("The elements of the array are: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void add()
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        System.out.println("The sum is: "+sum);
    }
    public void average()
    {
        int ave=0,sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        ave=sum/size;
        System.out.println("The average of the elements is: "+ave);
    }
    public void index(int n)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("The number "+n+" is the "+i+"th element of the array");
            }
            else
            {
                System.out.println("The number "+n+" is not found");
            }
        }
    }
    public void contains(int n)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("The number "+n+" is present in the array");
            }
            else
            {
                System.out.println("The number "+n+" is not found in the array");
            }
        }
    }
    public void remove(int n)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==n)
            {
                arr[i]=0;
            }
            else
            {
                System.out.println("The element "+n+" is not in the array.");
            }
        }
    }
    public void copy()
    {
        int []arr1=new int[size];
        for(int i=0;i<size;i++)
        {
            arr1[i]=arr[i];
        }
        System.out.println("The copied array: ");
        for(int j=0;j<size;j++)
        {
            System.out.println(arr1[j]);
        }
    }
    public void insert(int n,int index)
    {
        int []arr1=new int[size+1];
        for(int k=0;k<arr1.length;k++)
        {
            arr1[k]=0;
        }
        for(int i=0;i<index-1;i++)
        {
            arr1[i]=arr[i];
        }
        arr1[index-1]=n;
        for(int j=index;j<arr1.length;j++)
        {
            arr1[j]=arr[j-1];
        }
        System.out.println("The new array: ");
        for(int y=0;y<arr1.length;y++)
        {
            System.out.println(arr1[y]);
        }
    }
    public void min_max()
    {
        int []arr1=new int[size];
        int temp=0;
        for(int o=0;o<size;o++)
        {
            arr1[o]=arr[o];
        }
        for(int i=0;i<size;i++)
        {
            for(int j=1;j<size;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        System.out.println("The maximum number is: "+arr1[size-1]);
        System.out.println("The minimum number is: "+arr1[0]);
    }
    public void reverse()
    {
        int []arr1=new int[size];
        int arr2[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr1[i]=arr[i];
        }
        for(int j=0;j<size;j++)
        {
            arr2[j]=arr1[size-j];
        }
        System.out.println("The reversed array is: ");
        for(int s=0;s<size;s++)
        {
            System.out.println(arr2[s]);
        }
    }       
    public void find_dupli()
    {
        int []arr1=new int[size];
        int temp=0,diff=0,count=0;
        for(int i=0;i<size;i++)
        {
            arr1[i]=arr[i];
        }
        for(int i=0;i<size;i++)
        {
            for(int j=1;j<size;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        for(int k=0;k<size-1;)
        {
            do
            {
                diff=arr1[k]-arr1[k+1];
                count++;
                k++;
            }while(diff!=0);
            if(count>1)
            {
                System.out.println("The number "+arr1[k]+" has been duplicated "+count+" times");
            }
            else
            {
                k++;
            }
        }
    }
    public void common(int a[])
    {
        System.out.println("The common elements are: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(a[i]==arr[j])
                {
                    System.out.println(a[i]);
                }
                else
                {
                    continue;
                }
            } 
        }
    }
    public void rem_duplicate()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }
                else
                {
                    continue;
                }
            }
        }
    }
    public void sec_largest()
    {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The second largest element in the array is: "+arr[size-2]);
    }
    public void count_even_odd()
    {
        int count_even=0,count_odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }
        }
        System.out.println("The number of even numbers are: "+count_even);
        System.out.println("The number of odd numbers are: "+count_odd);
    }
    public void difference()
    {
        int diff=0,temp=0;
        for(int i=0;i<size;i++)
        {
            for(int j=1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        diff=arr[size-1]-arr[0];
        System.out.println("The difference between the largest and the smallest element of the array is: "+diff);
    }
    public void find_num()
    {
        int a=12,b=23;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==12 || arr[i]==23)
            {
                System.out.println("The number "+arr[i]+" is found in the array");
            }
            else
            {
                continue;
            }
        }
    }
    public void rem_and_ret()
    {
        int count_dupli=0,k=0;
        int arr1[];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                    count_dupli++;
                }
                else
                {
                    continue;
                }
            }
        }
        k=0;
        arr1=new int[size-count_dupli];
        for(int g=0;g<size;g++)
        {
            if(arr[g]!=0)
            {
                arr1[k]=arr[g];
                k++;
            }
            else
            {
                g++;
            }
        }
    }
    public void find_missing(int arr2[])
    {
        int temp=0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=1;j<arr2.length;j++)
            {
                if(arr2[i]>arr2[j])
                {
                    temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        for(int a=0;a<arr2.length;a++)
        {
            if(arr2[a]!=a+1)
            {
                System.out.println("the missing number is: "+a+1);
            }
        }
    }
    public static void main(String[]args)throws IOException
    {
        System.out.println("Enter the size of the array: ");
        int si=Integer.parseInt(br.readLine());
        int k1[];
        Array obj=new Array(si);
        obj.input();
        obj.print();
        obj.add();
        obj.average();
        System.out.println("Enter the element for which the index is to be found: ");
        int a=Integer.parseInt(br.readLine());
        obj.index(a);
        System.out.println("Enter the element to find it: ");
        int b=Integer.parseInt(br.readLine());
        obj.contains(b);
        System.out.println("Enter the element to be removed: ");
        int c=Integer.parseInt(br.readLine());
        obj.remove(c);
        System.out.println("The new array: ");
        obj.print();
        System.out.println("Enter the elements of the new array: ");
        obj.input();
        obj.copy();
        System.out.println("Enter the number to be inserted: ");
        int d=Integer.parseInt(br.readLine());
        System.out.println("Enter the index where the number is to be inserted: ");
        int e=Integer.parseInt(br.readLine());
        obj.insert(d,e);
        obj.min_max();
        obj.reverse();
        System.out.println("Enter the new array: ");
        obj.input();
        obj.find_dupli();
        System.out.println("Enter the test array: ");
        int []k=new int[si];
        for(int o=0;o<si;o++)
        {
            k[o]=Integer.parseInt(br.readLine());
        }
        obj.common(k);
        obj.rem_duplicate();
        obj.sec_largest();
        obj.count_even_odd();
        obj.difference();
        obj.find_num();
        obj.rem_and_ret();
        k1=new int[100]; 
        System.out.println("Enter 100 elements: ");
        for(int i=0;i<100;i++)
        {
            k1[i]=Integer.parseInt(br.readLine());
        }
        obj.find_missing(k);
    }
}
        