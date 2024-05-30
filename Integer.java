import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        int num;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter an integer value:");
        num = Scan.nextInt();

        while (num!=0)
            num = Scan.nextInt();
        System.out.println("\n Program closed!");
        System.out.println("\n You've entered:" +num);

    }
}
