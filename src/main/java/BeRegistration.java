import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BeRegistration {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBE() throws Exception {
    driver.get("https://maser.zefik.net/RegistrationBE");
    driver.findElement(By.id("Name")).clear();
    driver.findElement(By.id("Name")).sendKeys("Alexey Stankevych");
    driver.findElement(By.id("DBA")).clear();
    driver.findElement(By.id("DBA")).sendKeys("DBA name");
    driver.findElement(By.id("Address")).click();
    driver.findElement(By.id("Address")).clear();
    driver.findElement(By.id("Address")).sendKeys("Voluptatem Unde cup");
    driver.findElement(By.id("City")).click();
    driver.findElement(By.id("City")).clear();
    driver.findElement(By.id("City")).sendKeys("Los Angeles");
    driver.findElement(By.id("State")).click();
    new Select(driver.findElement(By.id("State"))).selectByVisibleText("CA");
    driver.findElement(By.id("Zip")).click();
    driver.findElement(By.id("Zip")).clear();
    driver.findElement(By.id("Zip")).sendKeys("77777");
    driver.findElement(By.id("Country")).click();
    new Select(driver.findElement(By.id("Country"))).selectByVisibleText("United States of America");
    driver.findElement(By.id("PrimaryPhone")).click();
    driver.findElement(By.id("PrimaryPhone")).clear();
    driver.findElement(By.id("PrimaryPhone")).sendKeys("8085555555");
    driver.findElement(By.id("Phone")).click();
    driver.findElement(By.id("Phone")).clear();
    driver.findElement(By.id("Phone")).sendKeys("8089999999");
    driver.findElement(By.id("CompanyEmail")).click();
    driver.findElement(By.id("CompanyEmail")).clear();
    driver.findElement(By.id("CompanyEmail")).sendKeys("companyemail@mailinator.com");
    driver.findElement(By.id("WebSiteUrl")).click();
    driver.findElement(By.id("WebSiteUrl")).clear();
    driver.findElement(By.id("WebSiteUrl")).sendKeys("http://website.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Business Trades'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("((.//div[@class='selectize-dropdown-content']/div[@class='optgroup'])[1])/div[6]")).click();
    driver.findElement(By.id("WebSiteUrl")).click();
    driver.findElement(By.id("goToContactSection")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Shea");
    driver.findElement(By.id("middleName")).click();
    driver.findElement(By.id("middleName")).clear();
    driver.findElement(By.id("middleName")).sendKeys("j");
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Connor");
    driver.findElement(By.id("title")).click();
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("Title");
    driver.findElement(By.id("employmentType")).click();
    new Select(driver.findElement(By.id("employmentType"))).selectByVisibleText("Executive Officer/Business Owner");
    driver.findElement(By.id("employmentType")).click();
    driver.findElement(By.id("contact-address")).click();
    driver.findElement(By.id("contact-address")).clear();
    driver.findElement(By.id("contact-address")).sendKeys("Address Primary contact");
    driver.findElement(By.id("contact-city")).click();
    driver.findElement(By.id("contact-city")).clear();
    driver.findElement(By.id("contact-city")).sendKeys("City Primary");
    driver.findElement(By.id("contact-state")).click();
    new Select(driver.findElement(By.id("contact-state"))).selectByVisibleText("MA");
    driver.findElement(By.id("contact-state")).click();
    driver.findElement(By.id("contact-zip")).click();
    driver.findElement(By.id("contact-zip")).clear();
    driver.findElement(By.id("contact-zip")).sendKeys("33333");
    driver.findElement(By.id("contact-country")).click();
    new Select(driver.findElement(By.id("contact-country"))).selectByVisibleText("United States of America");
    driver.findElement(By.id("contact-country")).click();
    driver.findElement(By.id("CellPhone")).click();
    driver.findElement(By.id("CellPhone")).clear();
    driver.findElement(By.id("CellPhone")).sendKeys("8089999999");
    driver.findElement(By.id("WorkPhone")).click();
    driver.findElement(By.id("WorkPhone")).clear();
    driver.findElement(By.id("WorkPhone")).sendKeys("8085555555");
    driver.findElement(By.id("WorkPhoneExt")).click();
    driver.findElement(By.id("WorkPhoneExt")).clear();
    driver.findElement(By.id("WorkPhoneExt")).sendKeys("4444444");
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("primaryemail@mailinator.com");
    driver.findElement(By.id("goToCompleteRegistration")).click();
    driver.findElement(By.id("CardNumber")).click();
    driver.findElement(By.id("CardNumber")).clear();
    driver.findElement(By.id("CardNumber")).sendKeys("4000 1000 1111 2224");
    driver.findElement(By.id("CardExpirationMonth")).click();
    driver.findElement(By.id("CardExpirationMonth")).clear();
    driver.findElement(By.id("CardExpirationMonth")).sendKeys("09");
    driver.findElement(By.id("CardExpirationYear")).click();
    driver.findElement(By.id("CardExpirationYear")).clear();
    driver.findElement(By.id("CardExpirationYear")).sendKeys("19");
    driver.findElement(By.id("CardHolder")).click();
    driver.findElement(By.id("CardHolder")).clear();
    driver.findElement(By.id("CardHolder")).sendKeys("Cardholder Name");
    driver.findElement(By.id("CardCellphone")).click();
    driver.findElement(By.id("CardEmail")).click();
    driver.findElement(By.id("CardEmail")).clear();
    driver.findElement(By.id("CardEmail")).sendKeys("paymentemail@mailinator.com");
    driver.findElement(By.id("AVSAddress")).click();
    driver.findElement(By.id("AVSAddress")).click();
    driver.findElement(By.id("AVSAddress")).clear();
    driver.findElement(By.id("AVSAddress")).sendKeys("payment address");
    driver.findElement(By.id("CardCity")).click();
    driver.findElement(By.id("CardCity")).clear();
    driver.findElement(By.id("CardCity")).sendKeys("payment city");
    driver.findElement(By.id("AVSZipCode")).click();
    driver.findElement(By.id("AVSZipCode")).clear();
    driver.findElement(By.id("AVSZipCode")).sendKeys("11111");
    driver.findElement(By.id("CardState")).click();
    new Select(driver.findElement(By.id("CardState"))).selectByVisibleText("FL");
    driver.findElement(By.id("CardState")).click();
    driver.findElement(By.id("CardCountry")).click();
    new Select(driver.findElement(By.id("CardCountry"))).selectByVisibleText("United States of America");
    driver.findElement(By.id("CardCountry")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Country'])[3]/following::button[1]")).click();
    driver.findElement(By.id("CardVerificationCode")).click();
    driver.findElement(By.id("CardVerificationCode")).clear();
    driver.findElement(By.id("CardVerificationCode")).sendKeys("777");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Country'])[3]/following::button[1]")).click();
    driver.findElement(By.id("confirm-payment")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
