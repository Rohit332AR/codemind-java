import java.util.*;
class Pattern{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=64+n;
        for(int i=65;i<=a;i++){
            for(int j=65;j<=a;j++){
                char c=(char)i; 
                System.out.printf("%c ",c);
                
            }
            System.out.println();
        }
    }
}