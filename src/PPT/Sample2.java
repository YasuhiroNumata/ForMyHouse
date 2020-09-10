package PPT;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	@Test
    public void testGoogleSearch() throws InterruptedException {
      // Optional, if not specified, WebDriver will search your path for chromedriver.
      System.setProperty("webdriver.chrome.driver", "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      driver.get("https://www.good-works.co.jp/");      //企業ページへアクセス
      Thread.sleep(5000);       // Let the user actually see something! (画面を見るための時間)

      // 「企業情報」リンクをクリックする ここでは「XPath」というものを使って、リンクを指定している
      driver.findElement(By.xpath("//*[@id=\"site-header-menu\"]/div/ul/li[1]/a")).click();
      Thread.sleep(5000);       // Let the user actually see something! (画面を見るための時間)


      driver.navigate().back();     //一つ前に戻る
      Thread.sleep(5000);      // Let the user actually see something! (画面を見るための時間)
      driver.quit();       //全ウィンドウを閉じる
	}
}
