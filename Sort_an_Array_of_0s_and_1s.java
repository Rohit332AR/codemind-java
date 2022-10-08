import java.util.*;
class AR{
    public static void main(String[] args){
        int c=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
          if(arr[i]==0){
          c++;
        }
        }
        for(int i=0;i<c;i++){
            arr[i]=0;
            }
            for(int i=c;i<arr.length;i++){
                arr[i]=1;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        
    }
}