package by.epamlab.testng_hometask.timeout_test;

import com.epam.tat.module4.Timeout;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TimeoutSleepTest {

    @Parameters({"sleep-seconds"})
    @Test(description = "Check sleep method")
    public void checkSleep(int seconds) {
        Timeout.sleep(seconds);
    }
}
