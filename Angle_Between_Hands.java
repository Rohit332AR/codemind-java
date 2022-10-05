import java.util.*;
class AngleBetweenHands{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();
        String index[]=line.split(":");
        int h=Integer.parseInt(index[0]);
        int m=Integer.parseInt(index[1]);
        double a=Math.abs((h*30)-(11*m)/2.0);
        if(a<360-a){
            if(a>(int)a){
                System.out.printf("%.1f",a);
            }
            else{
                System.out.printf("%.1f",a);
            }
        }
        else
        {
            if(360-1>(int)360-a){
                System.out.printf("%.1f",360-a);
            }
            else{
                System.out.format("%.1f",(360-a));
            }
        }
    }
}