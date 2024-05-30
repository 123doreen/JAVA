import java.util.Scanner;

public class Input {
    public static void main(String[]args){

       String srg;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter string here;");
        srg= scan.next();

        System.out.println("The number is: "+srg);
    }
}