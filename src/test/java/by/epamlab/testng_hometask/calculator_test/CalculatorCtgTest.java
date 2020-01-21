package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorCtgTest extends CalculatorConditions {

    @Parameters({"number", "expected-number"})
    @Test(description = "Check ctg operation")
    public void checkCtgOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().ctg(number);
        Assert.assertEquals(actualResult, expectedResult, delta);
    }
}
