package dsaChallange90Day.day3To6.recursion;

public class Factorial {
    public static int  factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fac=factorial(n-1);
        int facto= fac*n;
        System.out.println("The Factorial of " +n+ "is" +facto);
        return n;
    }
    public static void main(String[] args){
        int n=5;
        factorial(n);
    }
}
