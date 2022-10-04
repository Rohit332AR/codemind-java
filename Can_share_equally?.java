import java.util.Scanner;
class Share{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        if(x%2==0 && (x>0||y%2==0)){
            System.out.println("YES");
        }
         
        else{
            System.out.println("NO");
        }
    }
}