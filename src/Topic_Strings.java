
import java.util.Scanner;


public class Topic_Strings {
    public static void topic_strings(Topic_Strings[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        if(scanner.hasNextInt()){
            int age = scanner.nextInt();
            System.out.println("You are" + age);
        }else {
            System.out.println("Please write only number !");
        };
        scanner.nextLine(); //This is Dummy

        System.out.println("What is your name?");
        if(scanner.hasNextLine()){
            String name =scanner.nextLine();
            System.out.println("Your name is " + name);
        }
        else {
            System.out.println("Please write true name!");
        }


    }

}
