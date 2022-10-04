import java.util.Scanner;
class ColorCode{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char c=in.next().charAt(0);
        if(c=='v'||c=='V'){
            System.out.println("Violet");
        }
        else if(c=='I'||c=='i'){
            System.out.println("Indigo");
        }
        else if(c=='B'||c=='b'){
            System.out.println("Blue");
        }
        else if(c=='G'||c=='g'){
            System.out.println("Green");
        }
        else if(c=='Y'||c=='y'){
            System.out.println("Yellow");
        }
        else if(c=='O'||c=='o'){
            System.out.println("Orange");
        }
        else if(c=='R'){
            System.out.println("Red");
        }
        else{
            System.out.println("-1");
        }
    }
}