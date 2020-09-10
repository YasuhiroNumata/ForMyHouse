package WebManage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forward {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\\\ws2020\\\\Test1021\\\\exe\\\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //Googleページに移行
	    driver.get("https://www.google.co.jp");
	    //リンクテキスト名が"画像"の要素を取得
	    WebElement element = driver.findElement(By.linkText("画像"));
	    //画像のリンクをクリックし画像検索ページへ移行
	    element.click();
	    //Web検索ページへ戻る(ブラウザを履歴中で一段階戻す)
	    driver.navigate().back();
	    //ページが完全にロードされるまで待機
	    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    //画像検索ページへ進む(ブラウザを履歴中で一段階進める)
	    driver.navigate().forward();
	    //ページが完全にロードされるまで待機
	    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

	}

}
