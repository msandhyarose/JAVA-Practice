
import java.util.Scanner;
class Problem4Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a your size in number: ");
        int size = scanner.nextInt();
        
        switch (size) {
            case 29:
                System.out.println("Size 29 is: Small");
                break;
            case 30:
                System.out.println("Size 30 is: Medium");
                break;
            case 38:
                System.out.println("Size 38 is: Large");
                break;
            case 42:
                System.out.println("Size 42 is: Extra Large");
                break;
            default:
                System.out.println("Invalid size");
        }
    }
}