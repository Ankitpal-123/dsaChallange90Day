package dsaChallange90Day;

public class Day1 {
  public static void printFabbi(int a, int b, int n){
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.print(c);
        printFabbi(b,c,n-1);
    }
    public static void main(String[] args){
        int a=0;
        int b=1;
        int n=7;
        printFabbi(a,b,n-2);
    }


}
