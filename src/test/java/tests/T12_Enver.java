package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class T12_Enver {


    @Test
    public void test01(){
        //1-Qualitydemy anasayfasina gidiniz.
        Driver.getdriver().get(ConfigReader.getProperty("qdUrl"));

        //a[@class='navbar-brand pt-2 mt-1']

        //2-sign up butonunu locate edip tiklayiniz.
        QualityDemyPage qualityDemyPage=new QualityDemyPage();
        //qualityDemyPage.signUpButonu.click();

        //3-ilgili formu doldurarak kayit olunuz.
        //qualityDemyPage.firstName.sendKeys("212121" + Keys.TAB+"1212"+Keys.TAB +
        //      "egauoxya88@best-john-boats.com"+Keys.TAB + "Sanane.38"+Keys.TAB +Keys.ENTER);


        Driver.getdriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();

        ReusableMethods.wait(3);

        //4-kayitli email ve sifre ile giris yapabildiginizi test ediniz.
        SoftAssert softAssert=new SoftAssert();
        qualityDemyPage.ilkLoginLinki.click();

        qualityDemyPage.kullaniciEmailKutusu.sendKeys("egauoxya88@best-john-boats.com");
        qualityDemyPage.passwordKutusu.sendKeys("Sanane.38"+ Keys.ENTER);

        ReusableMethods.wait(2);


        Assert.assertTrue(qualityDemyPage.basariliGirisCoursesLinki.isDisplayed());
        //5- sayfaya giris yaptiktan sonra ilk cikan kursu sepete atiniz




        softAssert.assertAll();
    }
    //6- ilgili kursunu sepette olup olmadigini test ediniz.

}
