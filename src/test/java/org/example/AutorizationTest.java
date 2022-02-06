package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class  AutorizationTest{
    WebDriver driver = new ChromeDriver();

//    Авторизация по "Войти"
    @Test
    public void shouldConfigurator(){
        driver.get("http://10.100.21.24/");
        driver.findElement(By.cssSelector(" #login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.index-form.align-self-center.pl-4.pr-4 > div > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("test_a");
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("1-1");
        driver.findElement(By.cssSelector("#login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.login-form.align-self-center.pl-4.pr-4 > form > div.d-flex.justify-content-around > button.btn.btn-success")).click();

        driver.quit();

    }
    @Test
    public void shouldService(){
        driver.get("http://10.100.21.24/");
        driver.findElement(By.cssSelector(" #login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.index-form.align-self-center.pl-4.pr-4 > div > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("test_a");
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("1-1");
        driver.findElement(By.cssSelector("#login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.login-form.align-self-center.pl-4.pr-4 > form > div.d-flex.justify-content-around > button.btn.btn-success")).click();

        driver.quit();

    }
    @Test
    public void shouldExecutive(){
        driver.get("http://10.100.21.24/");
        driver.findElement(By.cssSelector(" #login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.index-form.align-self-center.pl-4.pr-4 > div > button:nth-child(3)")).click();
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("test_a");
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("1-1");
        driver.findElement(By.cssSelector("#login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.login-form.align-self-center.pl-4.pr-4 > form > div.d-flex.justify-content-around > button.btn.btn-success")).click();

        driver.quit();
    }

//    Авторизация по "Войти по ЭП"
@Test
public void shouldConfiguratorEP(){
    driver.get("http://10.100.21.24/");
    driver.findElement(By.cssSelector(" #login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.index-form.align-self-center.pl-4.pr-4 > div > button:nth-child(1)")).click();
    driver.findElement(By.cssSelector("[type='text']")).sendKeys("test_a");
    driver.findElement(By.cssSelector("[type='password']")).sendKeys("1-1");
    driver.findElement(By.cssSelector("#login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.login-form.align-self-center.pl-4.pr-4 > form > div.d-flex.justify-content-around > button.btn.btn-light")).click();

    driver.quit();

}
    @Test
    public void shouldServiceEP(){
        driver.get("http://10.100.21.24/");
        driver.findElement(By.cssSelector(" #login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.index-form.align-self-center.pl-4.pr-4 > div > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("test_a");
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("1-1");
        driver.findElement(By.cssSelector("#login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.login-form.align-self-center.pl-4.pr-4 > form > div.d-flex.justify-content-around > button.btn.btn-light")).click();

        driver.quit();

    }
    @Test
    public void shouldExecutiveEP(){
        driver.get("http://10.100.21.24/");
        driver.findElement(By.cssSelector(" #login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.index-form.align-self-center.pl-4.pr-4 > div > button:nth-child(3)")).click();
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("test_a");
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("1-1");
        driver.findElement(By.cssSelector("#login > div.container.d-flex.flex-column.full-height-vh.justify-content-between > div.login-form.align-self-center.pl-4.pr-4 > form > div.d-flex.justify-content-around > button.btn.btn-light")).click();

        driver.quit();
    }
}
