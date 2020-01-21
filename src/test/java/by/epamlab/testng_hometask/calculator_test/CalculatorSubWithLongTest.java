package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSubWithLongTest extends CalculatorConditions {

    @Parameters({"first-number", "second-number", "expected-number"})
    @Test(description = "Check sub operation with long value", groups = {"sub test"})
    public void checkSubOperationWithLong(long firstNumber, long secondNumber, long expectedResult) {
        long actualResult = getCalculator().sub(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
