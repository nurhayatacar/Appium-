import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hesapMakinasiTesti {
     AndroidDriver<AndroidElement> driver;

     //sadece android cihazlarda calisiyor ve daha dogru sonuc veriyor
    // android cihazlarla da calisabilir ama yanlislik orani daha yuksek olur
    // Android isletim sistemine sahip olan cihazlarda daha dogru sonucu vererek veya
    // yaptigimiz islemlere dogru komutlarin verilmesini saglar// ve sadece Android cihazlarda kullanilir
   // Android olmayan cihazlarda kesin calismaz anlamina gelmez, ama yanlislik orani daha yuksek oluur
     AppiumDriver<MobileElement> driver2;

     //ios icin tercih ediliyor
    // Hem Android hem Ios isletim sistemine sahip olan cihazlar icin kullanilir
    // Android driver icin ayri bir driver oldugundan dolayi, Appium driver Ios ve turevleri icin kullanilmaktadir.

    @Test
    public void hesapMakinesi() throws MalformedURLException {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //Bu dort islem bizim telefonumuzu karsi tarafa(server a tanitmak icin zorunlu
        //biz bu tanimlmalari appium servere gonderecegiz

       /*
        capabilities.setCapability("deviceName","Pixel 2");
        capabilities.setCapability("platformVersion","10.0");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","UiAutomator2");

        */
        driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        //bundan sonra driver calistiginda once tanimlamalar yapilacak 45.satir calistiginda capabilitiesi servere gonderiyoruz

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);









    }
}
