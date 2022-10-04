
import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int l=sc.nextInt();
        int [] a=new int[l];
        for (int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        int r=0;
        for (int i=0;i<l;i++)
        {
            r=r+a[i];
        }
        System.out.println(r);
    }}