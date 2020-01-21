package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTgTest extends CalculatorConditions {

    @Parameters({"number", "expected-number"})
    @Test(description = "Check tg operation")
    public void checkTgOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().tg(number);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
