package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class T4_Efe {
    //github instructions
    //1- projeyi github uzerinden pull ediniz
    //2- projeyi intelij de actiktdan sonra kendi branchinizi olusturunuz.
    //3- kendi branciniz uzerinde asagida yer alan testleri gerceklestiriniz.
    //4- test pass olduktan sonra kodunuzu github a push ediniz
    //testler
    @Test
    public void test01(){
        //1-Qualitydemy anasayfasina gidiniz.
        Driver.getdriver().get(ConfigReader.getProperty("qdUrl"));
        //2-sign up butonunu locate edip tiklayiniz.
        QualityDemyPage qualityDemyPage=new QualityDemyPage();
        qualityDemyPage.signUpButonu.click();
        //3-ilgili formu doldurarak kayit olunuz.
        qualityDemyPage.firstName.sendKeys("Efe" + Keys.TAB+"Torun"+Keys.TAB +
                                            "torunefe1990@gmail.com"+Keys.TAB + "123456Efe"+Keys.TAB +Keys.ENTER);
       //Bu asagidakileri yorum olarak biraktim denediklerimi görün diye
        //yorumlari kaldirirsaniz kod bozulur
        // Driver.getdriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        //Bunu Qualitydemy Page e eklemedim "Cookies kabul etttim

       // qualityDemyPage.sigUpButton2.click();//bu button calismadi bende Keys Tab deyip Keys Enter dedim
        ReusableMethods.wait(3);
        //4-kayitli email ve sifre ile giris yapabildiginizi test ediniz.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(qualityDemyPage.emailVerificationTexti.isDisplayed());
        //5- sayfaya giris yaptiktan sonra ilk cikan kursu sepete atiniz
        //Burada E mail ime Verification kodu geldi onu yazdim
        qualityDemyPage.verificationKutusu.sendKeys("129515");
        qualityDemyPage.continueButonu.click();
        //Her defasinda yani her Otomasyonda gmail ime yeni verification kodu geliyor o yüzden bundan
        //sonrasi biz tester lari asiyor arkadaslar:):)
    }
//6- ilgili kursunu sepette olup olmadigini test ediniz.





}
