package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class TestStudentRegistrationForm extends TestBase {
  RegistrationPage registrationPage = new RegistrationPage();

  @Test
  void successfulFillFormTest() {

    registrationPage.openPage()
            .removeHeader()
            .removeFooter()
            .setFirstNameInput("Elza")
            .setLastNameInput("Smite")
            .setUserEmailInput("elza@net.com")
            .setGender("Female")
            .setNumber("9115645654")
            .setBirthDate("14", "March", "1990")
            .setHobby("Sports")
            .setHobby("Reading")
            .setSubjectInput("Math")
            .uploadFile()
            .setCurrentAddress("London, 168")
            .setState("Haryana")
            .setCity("Karnal")
            .clickButton();

    registrationPage.verifyRegistrationResultsModalAppears()
            .verifyResult("Student Name", "Elza Smite")
            .verifyResult("Student Email", "elza@net.com")
            .verifyResult("Gender", "Female")
            .verifyResult("Mobile", "9115645654")
            .verifyResult("Date of Birth", "14 March,1990")
            .verifyResult("Subjects", "Maths")
            .verifyResult("Hobbies", "Sports, Reading")
            .verifyResult("Picture", "screenshot_1.png")
            .verifyResult("Address", "London, 168")
            .verifyResult("State and City", "Haryana Karnal");

  }
}
