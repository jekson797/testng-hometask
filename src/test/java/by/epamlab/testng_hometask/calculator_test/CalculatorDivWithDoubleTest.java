package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorDivWithDoubleTest extends CalculatorConditions {

    @Parameters({"first-number", "second-number", "expected-number"})
    @Test(description = "Check division operation with double value", groups = {"div test"})
    public void checkDivOperationWithDouble(double firstNumber, double secondNumber, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().div(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
