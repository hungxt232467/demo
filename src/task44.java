import java.util.Scanner;

public class task44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter aNumber: ");
        int num = input.nextInt();
        if (num % 3 == 0) {
            System.out.println("Inside Outer if Block");
            if (num % 5 == 0) {
                System.out.println("Number is divisible by 3 and 5");
            } else {
                System.out.println("Number is divisible by 3, but not by5 ");
            }
        }
        else {
            System.out.println("Number is not divisible by 3");
        }
    }
}
