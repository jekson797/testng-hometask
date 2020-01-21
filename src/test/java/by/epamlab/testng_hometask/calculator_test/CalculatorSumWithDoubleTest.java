package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSumWithDoubleTest extends CalculatorConditions {

    @Parameters({"first-number", "second-number", "expected-number"})
    @Test(description = "Check sum operation with double value", groups = {"sum test"})
    public void checkSumOperationWithDouble(double firstNumber, double secondNumber, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().sum(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
