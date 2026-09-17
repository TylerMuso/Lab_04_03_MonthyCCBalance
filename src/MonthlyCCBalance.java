public class MonthlyCCBalance {

    static void main() {

        double balance = 5000;
        final double RATE = .17;

        // First month:
        balance = balance + balance * RATE;

        IO.println("The balance after one month is: " + balance);

        //Second month:
        balance = balance + balance * RATE;

        IO.println("The balance after two months is: " + balance);
    }
}
