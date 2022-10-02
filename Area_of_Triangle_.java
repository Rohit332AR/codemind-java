import java.util.Scanner;
class AreaOfTriangle{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float a,b,c;
        double area,s;
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}