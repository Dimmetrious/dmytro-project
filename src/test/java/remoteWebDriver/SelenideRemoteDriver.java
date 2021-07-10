package remoteWebDriver;

import static com.codeborne.selenide.Configuration.browserCapabilities;
import static com.codeborne.selenide.Configuration.startMaximized;

public class SelenideRemoteDriver {

    /*
    Vnc enabled in case of running on selenoid > docker
    in case of running on remote machine - uncomment line in setupSelenide(String browser)
    and add propped address
         */

    public static void setupSelenide(String browser) {
        System.setProperty("selenide.browser", browser.toLowerCase());
//        remote = "remote address";
        browserCapabilities.setCapability("browserName", browser.toLowerCase());
        browserCapabilities.setCapability("enableVNC", true);
        browserCapabilities.setCapability("sessionTimeout", "1m");
        browserCapabilities.setCapability("name", "C.T.Co : Dmytro's test");
        startMaximized = true;
    }
}
