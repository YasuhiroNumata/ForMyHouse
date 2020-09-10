package WebManage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class refresh {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //Googleページに移行
	    driver.get("https://www.google.co.jp");
	    //ページが完全にロードされるまで待機
	    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    //検索テキストボックスの要素を取得
	    WebElement element = driver.findElement(By.id("lst-ib"));
	    //検索テキストボックスに"Test"と入力
	    element.sendKeys("Test");
	    //「Test」とテキストボックスに入力されていることを確認
	    try{
	       Thread.sleep(5000);
	     }catch (InterruptedException e){
        }
	    //ページを更新(ブラウザのリフレッシュボタン)
	    driver.navigate().refresh();
	}

}
