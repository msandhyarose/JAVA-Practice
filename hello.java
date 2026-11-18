

/*Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
Input:  2 Name y
Expected Output:
2
Name
y

 */

import java.util.Scanner;

public class hello {

    public static void main(String[]args)
    {
        System.out.println("Enter an integer, a string, and a character: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        char ch = sc.next().charAt(0);
        
        System.out.println("You entered: ");
        System.out.println(num);
        System.out.println(str);
        System.out.println(ch);
    }
}