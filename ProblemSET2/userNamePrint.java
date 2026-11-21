package ProblemSET2;
import java.util.Scanner;
public class userNamePrint {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first your name");
        String fname = sc.nextLine();
        System.out.println("Enter your last name");
        String lname = sc.nextLine();
        System.out.println("Number of times to print name");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(fname + " " + lname);
        }
        sc.close();
    }
}
