import java.util.Scanner;
class DickCapacity{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int tracks=in.nextInt();
        int sectors=in.nextInt();
        int blocks=in.nextInt();
        int Disk=2*512*tracks*sectors*blocks;
        System.out.println(Disk);
    }
}