import java.util.Scanner;
class Hand{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s=n*(n-1)/2;
	    System.out.printf("%d",s);
	}
}