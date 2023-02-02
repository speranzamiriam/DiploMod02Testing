import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ioAppTurismoTest {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;
    public static String mobileElement;

    //Elements
    String secondNewJob = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.ImageView";

    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy Nexus API 30 demo");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.rma.etur");
        caps.setCapability("appActivity","com.rma.etur.MainActivity");
        caps.setCapability("noReset","true");

        try {
             driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
            wait = new WebDriverWait(driver, 10);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void verificarCargaOpcionMenuInicio () throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]"))).click();
        // Click sobre login
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Inicio Inicio\"]"))).click();
        //Validar EL login
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View"))).isDisplayed();

        mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View"))).getText();
        Assert.assertTrue(mobileElement.contains("Verano en Rosario"));
    }

    @Test
    public void verificarCargaOpcionMenuCircuitos () throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]"))).click();
        // Click sobre login
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Circuitos Circuitos\"]"))).click();
        //Validar EL login
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Imagen ÁRBOLES DEL LAGUITO Circuito entre especies nativas y exóticas del Parque de la Independencia.\"]/android.view.View[2]/android.view.View[1]"))).isDisplayed();

        mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Imagen ÁRBOLES DEL LAGUITO Circuito entre especies nativas y exóticas del Parque de la Independencia.\"]/android.view.View[2]/android.view.View[1]"))).getText();
        Assert.assertTrue(mobileElement.contains("ÁRBOLES DEL LAGUITO"));
    }
    @Test
    public void verificarCargaOpcionMenuConfiguracion () throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]"))).click();
        // Click sobre login
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Configuración Configuración\"]"))).click();
        //Validar EL login
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Español\"]/android.view.View/android.view.View/android.view.View[2]"))).isDisplayed();

        mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Español\"]/android.view.View/android.view.View/android.view.View[2]"))).getText();
        Assert.assertTrue(mobileElement.contains("Español"));
    }
    @Test
    public void verificarInterCambioDeIdiomaInglesEspaniol () throws InterruptedException {


        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]"))).click();
        // Click sobre configuracion
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Configuración Configuración\"]"))).click();
        //Validar EL login
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Español\"]/android.view.View/android.view.View/android.view.View[2]"))).isDisplayed();

        //selecciona ingles
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Inglés\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View"))).click();
        //guardar opciones
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("(//android.view.View[@content-desc=\"index\"])[3]/android.view.View"))).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView"))).isDisplayed();

        mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView"))).getText();
        Assert.assertTrue(mobileElement.contains("ATTRACTION"));

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Setting Setting\"]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Spanish\"]/android.view.View/android.view.View/android.view.View[2]"))).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Spanish\"]/android.view.View/android.view.View/android.view.View[2]"))).click();

        //guardar opciones
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("(//android.view.View[@content-desc=\"index\"])[3]/android.view.View"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View"))).isDisplayed();

        mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View"))).getText();
        Assert.assertTrue(mobileElement.contains("Verano en Rosario"));
    }

    @Test
    public void verificarOpcionMenuConfiguracionValideQueExistanCambios () throws InterruptedException {


        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]"))).click();
        // Click sobre configuracion
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.view.View[@content-desc=\"Configuración Configuración\"]"))).click();
        //guardar opciones
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("(//android.view.View[@content-desc=\"index\"])[3]/android.view.View"))).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]"))).isDisplayed();

        mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]"))).getText();
        Assert.assertTrue(mobileElement.contains("Para que los cambios sean almacenados debés modificar la configuración."));
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

