package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorMultWithDoubleTest extends CalculatorConditions {

    @Parameters({"first-number", "second-number", "expected-number"})
    @Test(description = "Check multiplication operation with double value", groups = {"mult test"})
    public void checkMultOperationWithDouble(double firstNumber, double secondNumber, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().mult(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
