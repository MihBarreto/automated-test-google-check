package com.mihbarreto.testeautomatizado;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    }
}
