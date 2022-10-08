import java.util.*;
class Between{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int b=in.nextInt();
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=b){
            s+=arr[i];
            }
        }
         System.out.print(s);
    }
}