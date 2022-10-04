import java.util.Scanner;
class Count{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i;
        int n=in.nextInt();
        int k=in.nextInt();
        int[] s=new int[n];
        for( i=0;i<n;i++){
            s[i]=in.nextInt();
        }
        int c=0;
        for( i=0;i<n;i++){
            if(s[i]%k!=0){
                c=c+1;
                }
        }
        System.out.printf("%d",c);
    }
}