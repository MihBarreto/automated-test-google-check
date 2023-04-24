package com.mihbarreto.testeautomatizado;

import com.codeborne.selenide.Selenide;
import com.mihbarreto.testeautomatizado.page.GooglePO;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;
import static junit.framework.TestCase.assertTrue;

public class GoogleTest extends BaseTest {

   private static GooglePO googlePage;
    @BeforeClass
public static void prepararTestes(){

        googlePage = new GooglePO(driver);
}

    @Test
    public void devePesquisarNoGoogle(){

        googlePage.inputPesquisa.sendKeys("Batata Frita" + Keys.ENTER);

       //** WebElement inputPesquisa = driver.findElement(By.name("q"));//
       //** inputPesquisa.sendKeys("Batata Frita" + Keys.ENTER); **//

        String resultado = googlePage.divResultadoPesquisa.getText();
//                driver.findElement(By.id("result-stats")).getText();
        assertTrue(resultado, resultado.contains("Aproximadamente"));

         }

    @Test
    public void devePesquisarNoGoogle2(){

        googlePage.inputPesquisa.sendKeys("Sorvete" + Keys.ENTER);


        String resultado = googlePage.divResultadoPesquisa.getText();

        assertTrue(resultado, resultado.contains("Resultados"));




    }

}
