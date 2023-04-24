package com.mihbarreto.testeautomatizado.page;
/**
 *  Classe base para criação de novas PagesObjects
 *  Todas as pages devem ser herdadas desta classe
 */

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


public abstract class BasePO {

    protected WebDriver driver; //** Driver das pages/

//* Construtor Base para a criação da fábrica de elementos(PageFactory)  * //
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }
}
