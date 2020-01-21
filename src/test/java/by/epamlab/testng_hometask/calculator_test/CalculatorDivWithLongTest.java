package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorDivWithLongTest extends CalculatorConditions {

    @Parameters({"first-number", "second-number", "expected-number"})
    @Test(description = "Check division operation with long value", groups = {"div test"})
    public void checkDivOperationWithLong(long firstNumber, long secondNumber, long expectedResult) {
        long actualResult = getCalculator().div(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
