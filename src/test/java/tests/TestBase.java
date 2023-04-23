package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.BoxPage;
import pages.RegistrationPage;
import pages.components.CalendarComponent;

public class TestBase {

  RegistrationPage registrationPage = new RegistrationPage();

  BoxPage boxPage = new BoxPage();

  @BeforeAll
  static void beforeAll() {
    Configuration.baseUrl = "https://demoqa.com";
    Configuration.browserSize = "1520x1080";
    Configuration.browser = "firefox";
    //Configuration.timeout = 8000;
    //Эта настройка упрощает загрузку сайтов,
    //которые зависят от плохо грузящихся ресурсов
    Configuration. pageLoadStrategy="eager";
    Configuration.holdBrowserOpen = true;
  }
}

