package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorIsNumberPositiveTest extends CalculatorConditions {

    @Parameters({"positive-number"})
    @Test(description = "Check is number positive", groups = {"condition test"})
    public void checkIsPositiveCondition(long positiveNumber) {
        Assert.assertTrue(getCalculator().isPositive(positiveNumber));
    }
}
