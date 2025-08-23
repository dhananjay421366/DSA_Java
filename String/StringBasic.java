import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        /* String are immutable */
        char arr[] = { 'a', 'b', 'c' };
        String str = "Dhananjay";
        String str2 = new String("xyz");

        // String are immutable

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name ");
        // String name1 = sc.next(); // return first word
        System.out.println("Enter your name ");
        String name2 = sc.nextLine(); // return hole string

        // System.out.println("Your name is : " + name1.length());
        // System.out.println("Your name is : " + name2.length());
        // System.out.println("Your name is : " + name2.length());

        String firstName = "Dhananjay";
        String LastName = "Nimbalkar ";
        System.out.println(LastName + firstName); // string concate
        System.out.println(LastName.concat(firstName));

    }
}
