import java.util.Scanner;
class EvenRodd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        if(N%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}