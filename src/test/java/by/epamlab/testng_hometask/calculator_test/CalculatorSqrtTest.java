package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSqrtTest extends CalculatorConditions {

    @Parameters({"number", "expected-number"})
    @Test(description = "Check sqrt operation")
    public void checkSqrtOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().sqrt(number);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
