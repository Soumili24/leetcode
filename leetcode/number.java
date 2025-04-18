import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
         if (num>0)   {
            System.out.print(num+"is positive");
         }
         else if (num<0){
            System.out.print(num+"is negative");
         }
         else{
            System.out.print(num+"is 0");
         }
        sc.close();
    }
}
