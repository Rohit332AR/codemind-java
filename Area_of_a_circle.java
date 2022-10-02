import java.util.Scanner;
class AreaOfCircle{
    public static void main(String[] args){
        float r;
        Scanner in=new Scanner(System.in);
        r=in.nextFloat();
        double area=3.14*(r*r);
        System.out.printf("%.2f",area);
        
    }
}