package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSumWithLongTest extends CalculatorConditions {

    @Parameters({"first-number", "second-number", "expected-number"})
    @Test(description = "Check sum operation with long value", groups = {"sum test"})
    public void checkSumOperationWithLong(long firstNumber, long secondNumber, long expectedResult) {
        long actualResult = getCalculator().sum(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
