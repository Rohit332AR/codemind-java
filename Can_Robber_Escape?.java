import java.util.Scanner;
class CanRobberEscape{
    public static void main(String[] args){
        int n,m;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0)
               c+=1;
            
        }
        if(c<=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}