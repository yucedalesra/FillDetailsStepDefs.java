package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

        public LoginPage(){

            PageFactory.initElements(Driver.getDriver(),this);

        }
        @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
        public WebElement signUpLoginButton;

        @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
        public WebElement LoginYazisi;

        @FindBy(xpath = "//input[@data-qa='login-email']")
        public WebElement emailTextBox;

        @FindBy(xpath = "//input[@placeholder='Password']")
        public  WebElement passTextBox;

        @FindBy(xpath = "//button[normalize-space()='Login']")
        public WebElement loginButton;

        @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
        public WebElement incorrectYazisi;

    }


