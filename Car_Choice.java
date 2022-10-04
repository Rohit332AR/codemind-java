import java.util.Scanner;
class CarChoice{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float n,x1,x2,y1,y2;
        n=in.nextInt();
        for(int i=0;i<n;i++){
            x1=in.nextInt();
            x2=in.nextInt();
            y1=in.nextInt();
            y2=in.nextInt();
            double a=y1/x1;
            double b=y2/x2;
            if(a<b){
                System.out.println("-1");
            }
            if(a>b){
                System.out.println("1");
            }
            if(a==b){
                System.out.println("0");
            }
        }
    }
}