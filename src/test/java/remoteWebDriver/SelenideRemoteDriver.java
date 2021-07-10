package remoteWebDriver;

import static com.codeborne.selenide.Configuration.browserCapabilities;
import static com.codeborne.selenide.Configuration.startMaximized;

public class SelenideRemoteDriver {
    public static void setupSelenide(String browser) {
        System.setProperty("selenide.browser", browser);
        browserCapabilities.setCapability("browserName", browser);
        browserCapabilities.setCapability("enableVNC", true);
        browserCapabilities.setCapability("sessionTimeout", "1m");
        browserCapabilities.setCapability("name", "C.T.Co : Dmytro's test");
        startMaximized = true;
    }
}
