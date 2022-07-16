public class Main {

    public static void main(String[] args) {
        CreditPaymentService paymentService = new CreditPaymentService();

        System.out.println("Расчет ежемесячного платежа на срок 1 год: " + paymentService.calculate(1));
        System.out.println("Расчет ежемесячного платежа на срок 2 года: " + paymentService.calculate(2));
        System.out.println("Расчет ежемесячного платежа на срок 3 года: " + paymentService.calculate(3));
    }
}
