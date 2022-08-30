import java.util.Scanner;

public class Q7 {

        public static void main(String[] args){

        int w,x,y;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number 1=");
        w=in.nextInt();
        System.out.println("Enter the number 2=");
        x= in.nextInt();
        System.out.println("Enter the number 3=");
        y=in.nextInt();

        if(w>x&x>y){
            System.out.println(w+" "+x+" "+y+" in order");
        }else
        if(w<x&w<y){
            System.out.println(w+"  "+x+" "+y+" in order");
        }else
            System.out.println(w+" "+x+" "+y+"not in order");





    }

    }
