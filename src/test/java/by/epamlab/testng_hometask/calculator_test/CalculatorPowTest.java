package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorPowTest extends CalculatorConditions {

    @Parameters({"first-number", "second-number", "expected-number"})
    @Test(description = "Check pow operation")
    public void checkPowOperation(double firstNumber, double secondNumber, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().pow(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
