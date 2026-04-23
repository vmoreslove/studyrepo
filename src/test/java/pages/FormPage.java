package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    // ========== СТРАНИЦА АВТОРИЗАЦИИ ==========
    @FindBy(id = "loginEmail")
    private WebElement loginEmail;

    @FindBy(id = "loginPassword")
    private WebElement loginPassword;

    @FindBy(id = "authButton")
    private WebElement authButton;

    // ========== ОСНОВНАЯ ФОРМА ==========
    @FindBy(id = "dataEmail")
    private WebElement emailField;

    @FindBy(id = "dataName")
    private WebElement nameField;

    @FindBy(id = "dataGender")
    private WebElement genderSelect;

    @FindBy(id = "dataCheck11")
    private WebElement option11;

    @FindBy(id = "dataCheck12")
    private WebElement option12;

    @FindBy(id = "dataSelect21")
    private WebElement option21;

    @FindBy(id = "dataSelect22")
    private WebElement option22;

    @FindBy(id = "dataSelect23")
    private WebElement option23;

    @FindBy(id = "dataSend")
    private WebElement submitButton;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    // Авторизация - ТОЧНО КАК В DEBUGTEST
    public void login(String email, String password) throws Exception {
        System.out.println("=== АВТОРИЗАЦИЯ ===");

        // Ждем появления формы авторизации
        wait.until(ExpectedConditions.visibilityOf(loginEmail));

        // Очищаем и вводим данные
        loginEmail.clear();
        loginEmail.sendKeys(email);

        loginPassword.clear();
        loginPassword.sendKeys(password);

        // Нажимаем кнопку через JavaScript (как в DebugTest)
        js.executeScript("arguments[0].click();", authButton);
        System.out.println("Кнопка входа нажата через JavaScript");

        // Ждем 3 секунды (как в DebugTest)
        Thread.sleep(3000);

        // Проверяем, что форма авторизации скрылась
        boolean authHidden = !driver.findElement(By.id("authPage")).isDisplayed();
        System.out.println("Форма авторизации скрылась: " + authHidden);

        // Проверяем, что основная форма появилась
        boolean inputsVisible = driver.findElement(By.id("inputsPage")).isDisplayed();
        System.out.println("Основная форма видна: " + inputsVisible);

        if (!inputsVisible) {
            throw new RuntimeException("Авторизация не удалась!");
        }

        System.out.println("=== АВТОРИЗАЦИЯ УСПЕШНА ===");
    }

    public void fillForm(String email, String name, String gender,
                         boolean check11, boolean check12,
                         boolean check21, boolean check22, boolean check23) {
        System.out.println("Заполнение формы: " + email);

        emailField.clear();
        emailField.sendKeys(email);

        nameField.clear();
        nameField.sendKeys(name);

        // Выбор пола из выпадающего списка
        genderSelect.click();
        WebElement genderOption = driver.findElement(By.xpath("//select[@id='dataGender']/option[text()='" + gender + "']"));
        genderOption.click();

        // Чекбоксы
        setCheckbox(option11, check11);
        setCheckbox(option12, check12);

        // Радиокнопки
        if (check21) option21.click();
        else if (check22) option22.click();
        else if (check23) option23.click();
    }

    public void submitForm() {
        System.out.println("Отправка формы");
        submitButton.click();

        // Обработка алерта
        try {
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            System.out.println("Алерт закрыт");
        } catch (Exception e) {
            System.out.println("Алерта не было");
        }
    }

    private void setCheckbox(WebElement checkbox, boolean shouldBeChecked) {
        if (checkbox.isSelected() != shouldBeChecked) {
            checkbox.click();
        }
    }

    public boolean isUserInTable(String email) {
        try {
            WebElement row = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//table[@id='dataTable']//td[contains(text(),'" + email + "')]")
                    )
            );
            return row.isDisplayed();
        } catch (Exception e) {
            System.out.println("Пользователь " + email + " не найден в таблице");
            return false;
        }
    }
}