import java.util.Scanner;
import java.io.*;

public class Restart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number of Seconds: ");
        int sec = scan.nextInt();
        Runtime r = Runtime.getRuntime();
        try
        {
            System.out.println("The PC will get restarted after " +sec+" seconds.");
            r.exec("shutdown -r -t " +sec);
        }
        catch(IOException e)
        {
            System.out.println("Exception: " +e);
        }
    }
}
