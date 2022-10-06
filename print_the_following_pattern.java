import java.util.*;
class Pattern{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=64+n;
        for(int i=a;i>=65;i--){
            for(int j=65;j<=i;j++){
                char ch=(char)i;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}