package WebInfo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 //Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //指定したURLに遷移する<図1>
	    driver.get("file://C:\\ws2020\\Test1021\\html\\Alert_getText.html");
	    //画面表示されたダイアログをアクティブにする
	    Alert alert = driver.switchTo().alert();
	    //ダイアログに表示された文字列を取得する
	    System.out.println(alert.getText());

	}

}
