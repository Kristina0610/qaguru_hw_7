package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests extends TestBase {

  @Test
  void successfulFillFormTest() {

    boxPage
            .openPage()
            .setUserName("Mr Smith")
            .setUserEmail("aa@aaa.com")
            .setCurrentAddress("Some street 1")
            .setPermanentAddress("Another street 1")
            .clickSubmit();

    boxPage
            .verifyResult("name", "Mr Smith")
            .verifyResult("email", "aa@aaa.com")
            .verifyResult("currentAddress", "Some street 1")
            .verifyResult("permanentAddress", "Another street 1");
  }
}