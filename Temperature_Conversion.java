import java.util.Scanner;
class Conversion{
    public static void main(String[] args){
      float h;
        Scanner in=new Scanner(System.in);
        h=in.nextFloat();
        double F=32+(h*9/5);
        System.out.printf("%.2f",F);
    }
}