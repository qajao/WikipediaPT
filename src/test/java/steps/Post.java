 package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

 public class Post extends Base {
    private Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Given("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(url); // Abre o navegador no site alvo ( extendendo da base)
    }


    @When("^Exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto)  {
        assertTrue(base.driver.getTitle().contains(produto));


    }

     @Then("^pesquisa por \"([^\"]*)\"$")
     public void pesquisaPor(String produto) {
         base.driver.findElement(By.id("searchform")).click();
         base.driver.findElement(By.xpath("//*[@id='searchform']/div/div/input")).sendKeys(produto);
         base.driver.findElement(By.className("wvui-button")).click();
     }
 }
