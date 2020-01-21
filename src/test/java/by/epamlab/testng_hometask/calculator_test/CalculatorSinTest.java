package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSinTest extends CalculatorConditions {

    @Parameters({"number", "expected-number"})
    @Test(description = "Check sin operation")
    public void checkSinOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().sin(number);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
