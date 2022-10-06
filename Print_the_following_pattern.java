import java.util.Scanner;
class Pattern{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}