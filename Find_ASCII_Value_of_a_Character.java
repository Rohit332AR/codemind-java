import java.util.Scanner;
class Ascii{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char a=in.nextLine().charAt(0);
        int n=(int)a;
        System.out.printf("%d",n);
    }
}