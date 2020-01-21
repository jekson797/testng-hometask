package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorCosTest extends CalculatorConditions {

    @Parameters({"number", "expected-number"})
    @Test(description = "Check cos operation")
    public void checkCosOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().cos(number);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
