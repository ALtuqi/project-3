import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v;
        System.out.println("Enter number:");
        v = in.nextInt();
        if (v < 0) {
            v = v * -1;
            System.out.println(v);
        } else {
            System.out.println(v);
        }
        if (v < 10 && v > 0) {
            System.out.println(1);
        } else if (v < 100 && v > 10) {
            System.out.println(2);
        } else if (v < 1000 && v > 100) {
            System.out.println(3);
        } else if (v < 10000 && v > 1000) {
            System.out.println(4);
        } else if (v < 100000 && v > 10000) {
            System.out.println(5);

        } else if (v < 1000000 && v > 100000) {
            System.out.println(6);


        } else if (v < 10000000 && v > 1000000) {
            System.out.println(7);
        } else if (v < 100000000 && v > 10000000) {
            System.out.println(8);
        } else if (v < 1000000000 && v > 100000000) {
            System.out.println(9);
        }
    }
}
