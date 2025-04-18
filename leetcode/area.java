import java.util.Scanner;
public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius: ");
        int radius = sc.nextInt();
        double area = 3.14*Math.pow(radius,2);

        System.out.print("area of circle is " +area);
        sc.close();
    }
}
