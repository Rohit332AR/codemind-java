import java.util.*;
class Perfect{
    static void method(int n){
        int  i,re,s=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                s+=i;
            }
        }
        if((s-n)==n){
        System.out.println("True");
    }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        method(n);
    }
}