package com.mihbarreto.testeautomatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class GooglePO extends BasePO {

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;


    public GooglePO(WebDriver driver) {
        super(driver);
    }

    public void pesquisar(String texto) {

        inputPesquisa.sendKeys(texto + Keys.ENTER);

    }

    public String obterResultadoPesquisa() {
        return divResultadoPesquisa.getText();
    }
}