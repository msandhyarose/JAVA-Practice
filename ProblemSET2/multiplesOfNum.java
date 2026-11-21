package ProblemSET2;
import java.util.Scanner;
public class multiplesOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Multiples of " + n + ":");

        int i = 1;
            while (i * n <= 1000) 
            {
                System.out.println(i * n );
                i++;
            }
            

        sc.close();
    }
}