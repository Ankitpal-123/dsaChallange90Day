package dsaChallange90Day.day3To6;

public class ReversArray{
    public static void revArr(String str, int index){
        if(index==0){
            System.out.println(str.charAt(index));
        }
        System.out.print(str.charAt(index));
        revArr(str,index-1);
    }
   public static void main(String[] args){
       String str="cbfhofgio";
       revArr(str,str.length()-1);
   }
}
