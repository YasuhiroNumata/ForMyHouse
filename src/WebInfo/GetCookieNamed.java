package WebInfo;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetCookieNamed {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 //Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //指定したURLに遷移する（※下記のアドレスは架空のアドレスです）
	    driver.get("https://www.otameshi.co.jp");
	    //クッキー名からクッキーを検索
	    Cookie cookie = driver.manage().getCookieNamed("ABC");
	    //取得したクッキーを出力
	    System.out.println("---一致したクッキー---" );
	    System.out.println(cookie );
	}

}
