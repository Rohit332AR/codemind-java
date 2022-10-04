import java.util.Scanner;
class VC{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char cha=in.next().charAt(0);
        if(cha=='A'|| cha=='a'||cha=='e'||cha=='E'||cha=='I'||cha=='i'||cha=='O'||cha=='o'||cha=='U'||cha=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}