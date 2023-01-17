package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.IConfigurable;
import org.testng.annotations.Test;
import org.testng.internal.IConfiguration;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class T8_MehmetCil {

    //github instructions
    //1- projeyi github uzerinden pull ediniz
    //2- projeyi intelij de actiktdan sonra kendi branchinizi olusturunuz.
    //3- kendi branciniz uzerinde asagida yer alan testleri gerceklestiriniz.
    //4- test pass olduktan sonra kodunuzu github a push ediniz
    //testler

    @Test
    public void test01(){

        // 1-Qualitydemy anasayfasina gidiniz.
        Driver.getdriver().get(ConfigReader.getProperty("qdUrl"));

        // 2-Ana sayfada login girisini test ediniz
        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.ilkLoginLinki.click();

        // 3-Kullanici girisi test ediniz
        qualityDemyPage.kullaniciEmailKutusu.sendKeys("kabeg86625@themesw.com");
        qualityDemyPage.passwordKutusu.sendKeys("Asdfg123+" + Keys.ENTER);
    }

    //github instructions
    //1- projeyi github uzerinden pull ediniz
    //2- projeyi intelij de actiktdan sonra kendi branchinizi olusturunuz.
    //3- kendi branciniz uzerinde asagida yer alan testleri gerceklestiriniz.
    //4- test pass olduktan sonra kodunuzu github a push ediniz
    //testler
}
