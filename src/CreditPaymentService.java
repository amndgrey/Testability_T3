public class CreditPaymentService {
    public int calculate(int creditTerm) {

        double creditAmount = 1_000_000;
        int creditYear = creditTerm * 12;
        double loanInterest = 9.99;

        double interestRate = loanInterest / 100 / 12; //расчет процентной ставки

        double a1 = interestRate + 1;
        double a2 = creditYear;
        double degreeCalc = Math.pow(a1, a2); //возведение в степень

        double monthPay = creditAmount * (interestRate + (interestRate / (degreeCalc - 1)));//расчет ежемесячного платежа

        return (int) monthPay;
    }
}
