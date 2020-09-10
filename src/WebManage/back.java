package WebManage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class back {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //Googleページに移行
	    driver.get("https://www.google.co.jp");
	    //Yahooページに移行
	    driver.get("https://www.yahoo.co.jp");
	    //Googleページへ戻る(ブラウザを履歴中で一段階戻す)
	    driver.navigate().back();
	    //ページが完全にロードされるまで待機(最大10秒待機)
	    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

	}

}
