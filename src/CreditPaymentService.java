public class CreditPaymentService {

    public int calculate(double interestRate, int term, int loan) {


        int monthlyPayment;

        double monLoanRate = ((interestRate / 12)) / 100;
        double base = 1 + monLoanRate;
        double ans = Math.pow(base, term);
        double annCoef = (monLoanRate * ans) / (ans - 1); //annuity coefficient
        monthlyPayment = (int) (annCoef * loan);
        return (monthlyPayment);


    }


}
