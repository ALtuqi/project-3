import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        int  f;
        String g,color;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number from 1 to 8");
        f =in .nextInt();
        System.out.println("Enter char from a to h");
        g = in.next();
        if (g.equals("c")||g.equals("e")||g.equals("g"))
            if(f%2!=0){
                color="black";
                System.out.println(color);
            }else{
                color="white";
                System.out.println(color);
            }
        if(g.equals("b")||g.equals("d")||g.equals("f")||g.equals("h"))
            if(f%2==0){
                color="black";
                System.out.println(color);
            }else{
                color="white";
                System.out.println(color);

            }





    }
}
