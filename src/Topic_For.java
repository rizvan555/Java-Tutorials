import java.util.Scanner;

public class Topic_For {
    public static void main(String[] args) {
        System.out.println("Write one number: ");
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;
        int number = scanner.nextInt();

        for (int i=1; i<=number; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
