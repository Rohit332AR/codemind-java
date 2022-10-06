import java.util.Scanner;
class Diamond{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int l,j,k,i;
        int n=in.nextInt();
        if(n>=3){
        for( i=0;i<n;i++){
            for( j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
     }
        for(l=n-1;l>0;l--) {
        	  {
                  for( k=0;k<l;k++){
                      System.out.print("*");
                  }
                  System.out.println();
        }}
    }
    else
    System.out.println("The pattern is not possible");
}
}
