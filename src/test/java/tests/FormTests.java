package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.FormPage;

public class FormTests {
    private WebDriver driver;
    private FormPage formPage;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        String filePath = "file:///Users/olegkopylov/IdeaProjects/Protei/qa-test.html";
        driver.get(filePath);
        System.out.println("Открыта страница: " + filePath);

        formPage = new FormPage(driver);

        // Авторизация
        formPage.login("test@protei.ru", "test");
    }

    @Test
    @DisplayName("Тест создания пользователя - все опции Выбор 1")
    void testCreateUserWithOptions1() {
        formPage.fillForm(
                "test1@protei.ru",
                "Тест1",
                "Мужской",
                true,   // Вариант 1.1
                true,   // Вариант 1.2
                false,  // Вариант 2.1
                false,  // Вариант 2.2
                false   // Вариант 2.3
        );
        formPage.submitForm();

        Assertions.assertTrue(
                formPage.isUserInTable("test1@protei.ru"),
                "Пользователь test1@protei.ru не появился в таблице!"
        );
    }

    @Test
    @DisplayName("Тест создания пользователя - Выбор 2.1")
    void testCreateUserWithOption21() {
        formPage.fillForm(
                "test2@protei.ru",
                "Тест2",
                "Женский",
                false,  // Вариант 1.1
                false,  // Вариант 1.2
                true,   // Вариант 2.1
                false,  // Вариант 2.2
                false   // Вариант 2.3
        );
        formPage.submitForm();

        Assertions.assertTrue(
                formPage.isUserInTable("test2@protei.ru"),
                "Пользователь test2@protei.ru не появился в таблице!"
        );
    }

    @Test
    @DisplayName("Тест создания пользователя - Выбор 2.3")
    void testCreateUserWithOption23() {
        formPage.fillForm(
                "test3@protei.ru",
                "Тест3",
                "Мужской",
                false,  // Вариант 1.1
                false,  // Вариант 1.2
                false,  // Вариант 2.1
                false,  // Вариант 2.2
                true    // Вариант 2.3
        );
        formPage.submitForm();

        Assertions.assertTrue(
                formPage.isUserInTable("test3@protei.ru"),
                "Пользователь test3@protei.ru не появился в таблице!"
        );
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}