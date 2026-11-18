/*Triangle problem
 */


import java.util.Scanner;
public class ProblemSet1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();


        int sumOfAngles = angle1 + angle2 + angle3;

        if (sumOfAngles == 180) {
            System.out.println("Triangle can be formed");
        } else {
            System.out.println("Triangle cannot be formed");
        }
    }

    
}