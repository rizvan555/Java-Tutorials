import java.util.Scanner;

public class Topic_CleanCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Araban her 100 km-ye ne qeder yanacaq serf edir?!");
        double yanacaq = scanner.nextDouble();

        System.out.println("Senin araban her kilometre " + (yanacaq/100) + " litr yanacaq serf edir.");

    }};
