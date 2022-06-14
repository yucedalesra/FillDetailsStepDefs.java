package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.clickElement;
import static utilities.ReusableMethods.sendKeysElement;

public class LoginStepDefinition {
    LoginPage loginPage=new LoginPage();

    @When("kullanici tarayiciyi baslatir")
    public void kullanici_tarayiciyi_baslatir() {
        Driver.getDriver();
    }
    @Then("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));

    }
    @Then("ana sayfanin gorunur oldugunu test eder")
    public void ana_sayfanin_gorunur_oldugunu_test_eder() {
       String actualTitle=Driver.getDriver().getTitle();
       String expectedTitle="Automation Exercise";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("kullanici signup-login butonuna tiklar")
    public void kullanici_signup_login_butonuna_tiklar() {
        loginPage.signUpLoginButton.click();

    }
    @Then("kullanicinin Login to your account yazisinin gorunur oldugunu test eder")
    public void kullanicinin_login_to_your_account_yazisinin_gorunur_oldugunu_test_eder() {
     Assert.assertTrue(loginPage.LoginYazisi.isDisplayed());
    }
    @Then("kullanici yanlis email ve sifreyi  girer")
    public void kullanici_yanlis_email_ve_sifreyi_girer() {
      sendKeysElement(loginPage.emailTextBox,ConfigReader.getProperty("Wrongemail"));
        sendKeysElement(loginPage.passTextBox,ConfigReader.getProperty("Wrongpassword"));
        clickElement(loginPage.loginButton);

       // loginPage.emailTextBox.sendKeys("Wrongemail");

    }
    @Then("kullanici Your email or password is incorrect! yazisinin goruldugunu test eder")
    public void kullanici_your_email_or_password_is_incorrect_yazisinin_goruldugunu_test_eder() {
     Assert.assertTrue(loginPage.incorrectYazisi.isDisplayed());
    }

}
