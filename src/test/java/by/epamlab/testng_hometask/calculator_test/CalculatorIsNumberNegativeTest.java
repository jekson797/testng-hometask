package by.epamlab.testng_hometask.calculator_test;

import by.epamlab.testng_hometask.test_condition.CalculatorConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorIsNumberNegativeTest extends CalculatorConditions {

    @Parameters({"negative-number"})
    @Test(description = "Check is number negative", groups = {"condition test"})
    public void checkIsNegativeCondition(long negativeNumber) {
        Assert.assertTrue(getCalculator().isNegative(negativeNumber));
    }
}
