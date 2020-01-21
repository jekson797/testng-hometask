package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorMultWithLongTest extends CalculatorConditions {

    @Parameters({"first-number", "second-number", "expected-number"})
    @Test(description = "Check multiplication operation with long value", groups = {"mult test"})
    public void checkMultOperationWithLong(long firstNumber, long secondNumber, long expectedResult) {
        long actualResult = getCalculator().mult(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
