package lab8;
import java.util.Scanner;

public class Example13 {
    static Scanner sc = new Scanner(System.in);

    public static void recursion(){
        int n = sc.nextInt();

        if (n == 0)
            return;

        int skip = sc.nextInt();
        if (skip != 0)
            recursion();
        System.out.println(n);
    }
    public static void main(String[] args){
        recursion();
    }

}
