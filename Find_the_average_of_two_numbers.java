import java.util.Scanner;
class Average{
    public static void main(String[] args){
        float a,b;
        double c;
        Scanner in=new Scanner(System.in);
        a=in.nextFloat();
        b=in.nextFloat();
        c=(a+b)/2;
        System.out.printf("%.4f",c);
    }
}