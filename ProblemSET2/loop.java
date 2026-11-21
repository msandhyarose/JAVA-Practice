package ProblemSET2;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (i <= b) {
            System.out.println(a);
            i++;
        }
        sc.close();
    }
}

