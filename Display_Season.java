import java.util.Scanner;
class Season{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        if(N==4||N==5||N==6){
            System.out.println("Summer");
        }
        else if(N==7||N==8||N==9||N==10){
            System.out.println("Rainy");
        }
        else if(N==11||N==12||N==1){
            System.out.println("Winter");
        }
        else if(N==2 ||N==3){
            System.out.println("Spring");
        }
        else if(N>12){
            System.out.println("-1");
        }
    }
}