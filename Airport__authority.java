import java.util.*;
class AirportAuthority{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=in.nextInt();
        }
        int c=0,O=0;
        int l=in.nextInt();
        for(int i=0;i<m.length;i++){
            if(m[i]>l){
                c=c+1;
            }
            O=O+1;
        }
        System.out.print(O+c);
    }
}