package edu.cscc;

public class FizzBuzz {

    private static final String FIZZ_BUZZ = "fizzbuzz";
    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final int BUZZ_DIVISOR = 5;
    private static final int FIZZ_DIVISOR = 3;

    public String calculate(int aNumber) {
        if (isNumberFizzy(aNumber) && isNumberBuzzy(aNumber)) {
            return FIZZ_BUZZ;
        } else if (isNumberFizzy(aNumber)) {
            return FIZZ;
        } else if (isNumberBuzzy(aNumber)) {
            return BUZZ;
        }

        return Integer.toString(aNumber);
    }

    private boolean isNumberBuzzy(int aNumber) {
        return aNumber % BUZZ_DIVISOR == 0;
    }

    private boolean isNumberFizzy(int aNumber) {
        return aNumber % FIZZ_DIVISOR == 0;
    }
}
