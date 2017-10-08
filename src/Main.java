/**
 * Created by stephenboynton on 6/28/17.
 */
public class Main {

    public static void main (String[] args) {

        System.out.println(calculateInterest(50000, 18));

        for (int i = 2; i <= 5; i++) {
            System.out.println("Your calculated interest for " + i + "% is " + String.format("%.2f", calculateInterest(5000, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate/100);
    }
}
