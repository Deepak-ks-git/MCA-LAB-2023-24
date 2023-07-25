import java.util.*;

class NegativeNumber extends Exception {
    NegativeNumber(String s) {
        super(s);

    }
}

public class NegativeExcept {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of positive integers (n): ");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter a positive number");
                int num = sc.nextInt();
                if (num < 0) {
                    throw new NegativeNumber("Negative number are not allowed");
                }
                sum += num;
                count++;
            }
            double avg = sum / count;
            System.out.println("Average is :" + avg);
        } catch (NegativeNumber ne) {

            System.out.println(" occurs when" + ne);

        }

    }

}
