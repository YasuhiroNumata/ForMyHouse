package GetElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //指定したURLに遷移する
	    driver.get("https://www.google.co.jp");
	    //検索テキストボックスの要素をid属性値から取得
	    WebElement element = driver.findElement(By.id("gsfi"));
	    //検索テキストボックスに"WebDriver"を入力
	    element.sendKeys("WebDriver");
	    //Enterキーを押下して検索を実行
	    element.sendKeys(Keys.ENTER);

	}

}
