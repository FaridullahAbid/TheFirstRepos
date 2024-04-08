package StepDefination;

import Utilities.Utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookSteps extends Utilities {
    @Before
    public void intiatTest(){
        openBrowser();
    }
    @After

    public void CloseTest(){
        getdriver().quit();
    }


}
