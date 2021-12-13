package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url;          // endereco do site
    WebDriver driver;   //  Objeto do selenium webdriver

    @Before             // Antes do teste
    public void iniciar(){
        url = "https://pt.wikipedia.org/";
        // Onde est? o Chrome driver
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver(); // Instanciar o Selenium como Chrome Driver

        driver.manage().window().maximize(); // Maximizar janela do navegador
        // Define tempo de espera de 1 min, verificando o carregamento a cada milisegundo
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
    }
    @Test              // Durante o teste
    public void consultarArtigos(){
        // Abrir o site
        driver.get(url);
        //  Pesquisar por "Ovo de pascoa"
        driver.findElement(By.id("searchform")).click();
        driver.findElement(By.xpath("//*[@id='searchform']/div/div/input")).sendKeys("Ovo de Páscoa");
        //driver.findElement(By.id("searchform")).sendKeys("Ovo de P?scoa");

        driver.findElement(By.className("wvui-button")).click();

        //assertEquals("Ovo de Páscoa - Wikipédia, a enciclopédia livre", driver.getTitle());
        assertTrue(driver.getTitle().contains("Ovo de Páscoa"));

    }

    @After              // Depois do teste
    public void finalizar(){
        driver.quit();
    }

}
