package lab8;

import java.util.Scanner;

public class Example12 {
    static Scanner sc = new Scanner(System.in);

    public static void recursion() {
        int n = sc.nextInt();
        if (n == 0)
            return;

        recursion();

        if(n%2 != 0 )
            System.out.println(n);
    }
    public static void main(String[] args) {
        recursion();
    }

}
