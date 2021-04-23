package base;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestsPlus {
    private ChromeDriver driver;
    private String link = "http://the-internet.herokuapp.com/";

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(link);
        System.out.println("Page title is " + driver.getTitle());

    }
    public static void main(String[] args) {
        BaseTestsPlus test = new BaseTestsPlus();
        test.setUp();
        test.tearDown();
    }

    public void tearDown() {
        driver.quit();
    }
}







        /*
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        String href = inputsLink.getAttribute("href");
        System.out.println(href);

        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();
        driver.navigate().back();

        // homework task 1
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        WebElement example1Link = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1Link.click();

        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Menu items quantity is " + menuItems.size());

        */
