import com.appium.manager.ParallelThread;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    @Test
    public void testApp() throws Exception {
        ParallelThread parallelThread = new ParallelThread();
        List<String> test = new ArrayList<String>();
        test.add("LoginTest");
        boolean runner = parallelThread.runner("IOS_Sample");
        System.out.println(runner);
        Assert.assertFalse(runner);
    }

}
