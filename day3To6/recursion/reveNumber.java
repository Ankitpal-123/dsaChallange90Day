package dsaChallange90Day.day3To6.recursion;
import java.util.*;
public class reveNumber {
    public static void reverNum(int n){
        if(n==0){
            return ;
        }
        System.out.print(n);
        reverNum(n-1);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        reverNum(n);

    }
}
