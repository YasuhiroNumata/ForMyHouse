package WebInfo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class getScreenshotAs {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //指定したURLに遷移する
	    driver.get("https://www.google.co.jp");
	    //カレントページのスクリーンショットを取得
	    File sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //スクリーンショットファイルの存在を確認するため少し待機する
	    try {
	        Thread.sleep(15000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    //取得したスクリーンショットファイルのパスを表示
	    System.out.println(sfile);

	}

}
