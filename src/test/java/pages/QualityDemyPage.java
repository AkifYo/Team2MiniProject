package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage {

    public QualityDemyPage() {
        PageFactory.initElements(Driver.getdriver(),this);}
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(id="login-email")
    public WebElement kullaniciEmailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinki;

    @FindBy(xpath = "//a[@class='btn btn-sign-up']")
    public WebElement signUpButonu;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath ="//button[text()='Sign Up']")
    public WebElement sigUpButton2;
    @FindBy(xpath ="//h1[text()='Email verification']")
    public WebElement emailVerificationTexti;
    @FindBy(xpath ="//input[@id='verification_code']")
    public WebElement verificationKutusu;
    @FindBy(xpath ="//button[@onclick='continue_verify()']")
    public WebElement continueButonu;




    }

