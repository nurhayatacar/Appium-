package day_02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class arabamCom {
    AndroidDriver<AndroidElement>driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\acarn\\IdeaProjects\\Appium_Team116\\Apps\\arabam.com_4.8.0_Apkpure.apk");
        capabilities.setCapability("appPackage","com.dogan.arabam");//Hangi uygulama uzerinde calismak istiyorsak
        //capabilities.setCapability("appActivity","com.dogan.arabam.presentation.feature.home.HomeActivity");                                                                              // Apk Info dan uygulama bilgisine ulasabiliriz
        capabilities.setCapability("appActivity","com.darsh.multipleimageselect.activities.ImageSelectActivity");                                                                              // Apk Info dan uygulama bilgisine ulasabiliriz

        driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        //bundan sonra driver calistiginda once tanimlamalar yapilacak 45.satir calistiginda capabilitiesi servere gonderiyoruz
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test
    public void arabamTest(){
        //driver.activateApp("com.dogan.arabam");Bir uygulamayi aktif hale getirmek istedigimizde apk info dan bundleId degerini aliyoruz


    }
}
