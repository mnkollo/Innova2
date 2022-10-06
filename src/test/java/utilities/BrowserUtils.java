package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class BrowserUtils {


    /*
     * switches to new window by the exact title
     */
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**
     * return a list of string from a list of elements ignores any element with no
     * text
     *
     * @param list
     * @return
     */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    //public boolean visibility(WebElement element){
    //return ExpectedConditions.visibilityOf(element);
    //}

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static WebElement waitForVisibility(String locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }

    public static WebElement waitForClickability (WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickability(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

//    public static WebElement fluentWait(final WebElement, int timeinsec) {
//        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
//                .withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);
//        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return webElement;
//            }
//        });
//        return element;
//    }
    public static void dropdownValue(WebElement element, String value){
        Select select = new Select (element); //Create object of Select class
        select.selectByValue(value);
    }
    public static void dropdownIndex(WebElement element, int index){
        Select select = new Select (element); //Create object of Select class
        select.selectByIndex(index);
    }
    public static void dropdownVisible(WebElement element, String visible){
        Select select = new Select (element); //Create object of Select class
        select.selectByVisibleText(visible);
    }
    //switch from frame to default content
    public static void iframe(WebElement element){
        Driver.getDriver().switchTo().frame(element);
    }

    public static void waitForClickablility(WebElement hovers) {
    }
    public static void goBack(){
        Driver.getDriver().navigate().back();
    }
    public static void goForward(){
        Driver.getDriver().navigate().forward();
    }
    public static void refreshPage(){
        Driver.getDriver().navigate().refresh();
    }
    public static void goTo(String url){
        Driver.getDriver().navigate().to(url);
    }
    public static void switchToTab(String tabTitle){
        Set<String> windows = Driver.getDriver().getWindowHandles();

        System.out.println("Number of tabs: " + windows.size());

        System.out.println("Window handles: ");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window: " + window);
            Driver.getDriver().switchTo().window(window);

            System.out.println("Current window title: " + Driver.getDriver().getTitle());

            if(tabTitle.equals(Driver.getDriver().getTitle())){
                break;
            }
        }
    }
}
