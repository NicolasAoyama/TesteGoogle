package com.Google.Teste;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePO extends BasePO {

    // Mapeamento de elementos específicos da página do Google
    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(id = "result-stats")
    private WebElement searchResults;

    public GooglePO(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Método para realizar uma pesquisa no Google
    public void realizarPesquisa(String termo) {
        searchBox.sendKeys(termo + Keys.ENTER);
    }

    // Método para obter o texto dos resultados de pesquisa
    public String getTextoResultados() {
        return searchResults.getText();
    }
}
