
package SelfWork;

import java.math.BigDecimal;

public class MoneyProcessingProgram {
// A person invests $1000 in a savings account yielding 5% interest. Assuming that
// the person leaves all interest on deposit in the account, calculate and display the
// amount of money in the account at the end of each year for 10 years. Use the following
// formula for determining these amounts:
//           # a = p(1 + r)n
// where
// p is the original amount invested (i.e., the principal),
// r is the annual interest rate,
// n is the number of years and
// a is the amount on deposit at the end of the nth year.
//int amountOnDeposit;
//int rate;
//int principal;
//int numberOfYears;

    public static void main(String[] args) {
        BigDecimal principal = new BigDecimal(1000.00);
        BigDecimal rate = new BigDecimal(.05);

        BigDecimal one = new BigDecimal(1);

        BigDecimal constantRateComputation = one.add(rate);
        BigDecimal rateComputation = new BigDecimal(1);

        for (int numberOfYears= 1; numberOfYears <= 10; numberOfYears++){
            BigDecimal newRateComputation = rateComputation.multiply(constantRateComputation);
            BigDecimal amountOnDeposit = principal.multiply(newRateComputation);
           rateComputation = newRateComputation;
            System.out.printf("%2d %10.2f%n", numberOfYears, amountOnDeposit);
        }
    }
}