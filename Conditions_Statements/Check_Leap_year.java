import java.util.Scanner;

public class Check_Leap_year {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
            System.out.println("The year is leap year :" + year);

        } else {

            System.out.println("Not leap year :" + year);
        }

    }
}
