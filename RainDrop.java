import java.util.Scanner;
class RainDrop{
public static void main(String[] args){
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
        
         if(n%3==0 && n%5==0){
             System.out.println("PlingPlang");
         }
          else if(n%3==0&& n%7==0){
             System.out.println("PlingPlong");
         }
          else if(n%5==0&& n%7==0){
             System.out.println("PlangPlong");
         }
         else if(n%3==0){
             System.out.println("Pling");
         }
         else if(n%5==0){
             System.out.println("Plang");
         }
          else if(n%7==0){
             System.out.println("Plong");
         }
        
         else{
             System.out.printf("%d",n);
         }
         
         }
}