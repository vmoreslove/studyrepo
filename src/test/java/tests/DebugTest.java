package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

public class DebugTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String filePath = "file:///Users/olegkopylov/IdeaProjects/Protei/qa-test.html";
        driver.get(filePath);
    }

    @Test
    @DisplayName("Отладка: пошаговая проверка авторизации")
    void debugAuthStepByStep() throws Exception {
        System.out.println("=== ПОШАГОВАЯ ОТЛАДКА ===");

        // Шаг 1: Проверяем, что форма авторизации видна
        WebElement authPage = driver.findElement(By.id("authPage"));
        System.out.println("1. Форма авторизации видна: " + authPage.isDisplayed());

        // Шаг 2: Находим поля
        WebElement emailInput = driver.findElement(By.id("loginEmail"));
        WebElement passwordInput = driver.findElement(By.id("loginPassword"));
        WebElement loginButton = driver.findElement(By.id("authButton"));

        System.out.println("2. Все поля найдены");

        // Шаг 3: Вводим данные
        emailInput.sendKeys("test@protei.ru");
        passwordInput.sendKeys("test");
        System.out.println("3. Данные введены");

        // Шаг 4: Делаем скриншот перед нажатием
        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot1, new File("/Users/olegkopylov/IdeaProjects/Protei/before_login.png"));
        System.out.println("4. Скриншот до нажатия: before_login.png");

        // Шаг 5: Нажимаем кнопку через JavaScript (может помочь)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
        System.out.println("5. Кнопка нажата через JavaScript");

        // Шаг 6: Ждем 3 секунды
        Thread.sleep(3000);

        // Шаг 7: Делаем скриншот после нажатия
        File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot2, new File("/Users/olegkopylov/IdeaProjects/Protei/after_login.png"));
        System.out.println("6. Скриншот после нажатия: after_login.png");

        // Шаг 8: Проверяем результат
        boolean authStillVisible = driver.findElement(By.id("authPage")).isDisplayed();
        System.out.println("7. Форма авторизации все еще видна: " + authStillVisible);

        boolean inputsVisible = false;
        try {
            inputsVisible = driver.findElement(By.id("inputsPage")).isDisplayed();
            System.out.println("8. Основная форма видна: " + inputsVisible);
        } catch (Exception e) {
            System.out.println("8. Основная форма не найдена");
        }

        // Шаг 9: Проверяем наличие ошибок
        try {
            WebElement error = driver.findElement(By.cssSelector(".uk-alert-danger"));
            System.out.println("9. Сообщение об ошибке: " + error.getText());
        } catch (Exception e) {
            System.out.println("9. Сообщений об ошибке нет");
        }

        // Шаг 10: Выводим текущий URL
        System.out.println("10. Текущий URL: " + driver.getCurrentUrl());

        Assertions.assertTrue(inputsVisible, "Авторизация не удалась! Проверьте скриншоты.");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}