
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

    public static BigDecimal calculateAmount() {
        BigDecimal principal = new BigDecimal(1000.00);

        BigDecimal amountOnDeposit = principal.multiply(calculateRate());
        return amountOnDeposit;
    }

    private static BigDecimal calculateRate(){
        BigDecimal one = new BigDecimal(1);
        BigDecimal rate = new BigDecimal(.05);
        BigDecimal newRateComputation= null;
        BigDecimal constantRateComputation = one.add(rate);
        BigDecimal rateComputation = new BigDecimal(1);
        for (int numberOfYears= 0; numberOfYears <10; numberOfYears++){
           newRateComputation = rateComputation.multiply(constantRateComputation);
           rateComputation = newRateComputation;
            System.out.println(newRateComputation);
        }
        return newRateComputation;
    }

    public static void main(String[] args) {
        System.out.println(calculateAmount());
    }
}