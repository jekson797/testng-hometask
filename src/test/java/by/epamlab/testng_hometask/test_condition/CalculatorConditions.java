package by.epamlab.testng_hometask.test_condition;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class CalculatorConditions {

    private Calculator calculator;

    @BeforeMethod
    public void setUp(Method method) {
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown(Method method) {
        calculator = null;
    }

    protected Calculator getCalculator() {
        return calculator;
    }
}
