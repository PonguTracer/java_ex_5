import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String one = scnr.nextLine();
        String two = scnr.nextLine();
        String three = scnr.nextLine();
        String sum = one + two + three;

        if ((Integer.parseInt(one) < 0) || (Integer.parseInt(two) < 0) || Integer.parseInt(three) < 0) {
            System.out.println("Invalid input!");
            return;
        }
        int total = Integer.parseInt(sum);

        if (total % 3 == 0) {
            System.out.println(sum + " is divisible by 3!");
        }
        else {
            System.out.println(sum + " is not divisible by 3!");
        }
    }
}
