import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numberOne, numberTwo, add;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        numberOne = s.nextInt();
        System.out.println("Enter the second number:");
        numberTwo = s.nextInt();

        add = numberOne+numberTwo;
        System.out.println("\n Result ="+add);2
    }
}
