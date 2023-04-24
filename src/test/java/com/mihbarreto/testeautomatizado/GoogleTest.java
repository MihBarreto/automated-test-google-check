package com.mihbarreto.testeautomatizado;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;
import static junit.framework.TestCase.assertTrue;

public class GoogleTest {
    private WebDriver driver;
    private final String URL_BASE ="https://www.google.com/";
    private final String CAMINHO_DRIVER = "C:\\Users\\miche\\Documents\\Java\\testes-automatizados\\chromedriver.exe";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);

    }
    @Test
    public void devePesquisarNoGoogle(){
        iniciar();

        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("Batata Frita" + Keys.ENTER);

        String resultado = driver.findElement(By.id("result-stats")).getText();
        assertTrue(resultado, resultado.contains("Aproximadamente"));

        driver.quit();


    }
}
