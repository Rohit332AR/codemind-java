import java.util.Scanner;
class Area{
    public static void main(String[] args){
        float a,b,c;
        double s,ar;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        s=(double)(a+b+c)/2;
        ar=(double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
}