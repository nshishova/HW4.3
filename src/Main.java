public class Main {

    public static void main(String[] args) {

        System.out.println("Monthly credit payment");

        CreditPaymentService service = new CreditPaymentService();

        double interestRate = 9.99; // %
        int loan  = 1000000; // rub


        System.out.println("Monthly payment for 12mo term");
        System.out.println((service.calculate(interestRate, 12, loan)));

        System.out.println();
        System.out.println("Monthly payment for 24mo term");
        System.out.println((service.calculate(interestRate, 24, loan)));

        System.out.println();
        System.out.println("Monthly payment for 36mo term");
        System.out.println((service.calculate(interestRate,36, loan)));
    }
}
