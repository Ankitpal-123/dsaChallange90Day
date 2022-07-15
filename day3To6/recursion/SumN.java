package dsaChallange90Day.day3To6.recursion;

public class SumN {
    public static void sumOfN(int n, int sum, int i){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        sumOfN(n,sum,i+1);
    }
    public static  void main(String[] args){
        sumOfN(5,0,1);
    }
}
