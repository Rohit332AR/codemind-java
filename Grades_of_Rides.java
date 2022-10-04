import java.util.Scanner;
class Rides{
public static void main(String[] args){
         Scanner in=new Scanner(System.in);
         int a=in.nextInt();
         int b=in.nextInt();
         int c=in.nextInt();
         if(a>50 && b>60 && c>100){
             System.out.println("10");
         }
         else if(a>50 && b>60 && c<100){
            System.out.println("9");
         }
          else if(a<50 && b>60 && c>100){
            System.out.println("8");
         } 
         else if(a>50 && b<60 && c>100){
            System.out.println("7");
         } 
         else if((a>50 &&b<60 && c<100) || (a<50 && b<60 && c<100) || (a<50 && b<60 && c>100)){
            System.out.println("6");
         }
         else{
             System.out.println("5");
         }

         }
}