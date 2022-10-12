package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GWD {

    //public static WebDriver driver;//artik buna gerek kalmadi

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static ThreadLocal<String> browser = new ThreadLocal<>();

    //driver gonderirken set kullanacaz


    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));//dil hatasi icin
        System.setProperty("user.language", "EN");

        Logger.getLogger("").setLevel(Level.SEVERE);//log da temizlik
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        // System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        if (browser.get() == null && driver.get() == null) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
        }

        if (driver.get() == null) {
            // String browserName=browser.get();
            switch (browser.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    if (!runningFromIntelliJ()) {
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    driver.set(new ChromeDriver(options));
                    }
                    else  driver.set(new ChromeDriver());
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver.set(new SafariDriver());
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver.set(new EdgeDriver());
                    break;

            }

        }

        return driver.get();

    }


    public static void quitDriver() {


        if (driver.get() != null) { // driver varsa
            driver.get().quit();
             WebDriver driver1=null;
            // driver=null;
            driver.set(driver1);//bosa cikardik

        }
    }

    public static void Bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean runningFromIntelliJ()
    {
        String classPath = System.getProperty("java.class.path");
        return classPath.contains("idea_rt.jar");
    }
}
