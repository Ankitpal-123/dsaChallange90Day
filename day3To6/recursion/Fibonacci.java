package dsaChallange90Day.day3To6.recursion;

public class Fibonacci {
    public static void fibonacciNumber(int a, int b, int n){
        if (n == 0) {
            return;
        }
        int c=a+b;
        System.out.print(c);
        fibonacciNumber(b,c,n-1);
    }
    public static void main(String[] args){
        int a=0;
        int b=1;
        int n=9;
        fibonacciNumber(a, b, n-2);
    }
}
