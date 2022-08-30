import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        int d;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number 1=");
        d=in.nextInt();
        if(d>0){
            System.out.println("positive");
        }
        else
            if(d<0) {
                System.out.println("negative");
            }
                else System.out.println("0");


    }
}
