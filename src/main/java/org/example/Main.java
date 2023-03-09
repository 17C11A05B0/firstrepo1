package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevToolsException;
import org.openqa.selenium.devtools.DevTools;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91912\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&prevRID=0PXMVWQY7X2C2NDWYFWZ&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");




        //driver.close();





    }
}