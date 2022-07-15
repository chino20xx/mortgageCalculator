import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        final int months_in_year = 12;
        final int percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        int loanAmount = scanner.nextInt();

        System.out.print("Enter interest rate (%): ");
        double interestRatePercent = scanner.nextDouble();
        double monthlyInterest = interestRatePercent / percent / months_in_year;

        System.out.print("Enter mortgage term (years): ");
        int mortgageTerm = scanner.nextInt();
        int mortgageTermMonths = mortgageTerm * months_in_year;

double monthlyRepayment = loanAmount * ( (monthlyInterest * Math.pow((1 + monthlyInterest), mortgageTermMonths)) / (Math.pow((1 + monthlyInterest), mortgageTermMonths) - 1) );
        System.out.println("Monthly repayment: " + NumberFormat.getCurrencyInstance().format(monthlyRepayment));
    }
}