import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){

    int w,x,y;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number 1=");
        w=in.nextInt();
        System.out.println("Enter the number 2=");
        x= in.nextInt();
        System.out.println("Enter the number 3=");
        y=in.nextInt();

        if(w==x&x==y){
            System.out.println("all the same");
        }else
        if(w!=x&w!=y){
            System.out.println("all the different ");
        }else
            System.out.println("neither");





    }
}
