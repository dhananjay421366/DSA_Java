public class Reverse_No {
    public static void main(String args[]) {
        int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            // System.out.print(lastDigit);
            rev = (rev * 10) + lastDigit;
            n = n / 10;

        }
        System.out.println(rev);
    }
}
