class Solution{
    public boolean isPalimdrome(int x){
        if (x <0){
            return false;
        }
        int org = x;
        int rev = 0;
        while (x != 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return org == rev;
    }
}
public class palimdrome {
    public static void main ( String [] args){
        Solution solution = new Solution();
        int x = 121;
        if(solution.isPalimdrome(x)){
            System.out.println(+x+" is a palimdrome number");
        }
        else{
            System.out.println(+x+" is not a palimdrome number");
        }
    }
}
