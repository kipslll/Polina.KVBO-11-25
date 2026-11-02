package lab8;

public class Example14 {
    public static void recursion(int n){
        if(n < 10)
            System.out.print(n + " ");
        else {
            recursion(n/10);
            System.out.print(n%10 + " ");
        }
    }
    public static void main(String[] args){
        recursion(12345);
    }
}
