package WebManage;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();

	  try {
	    //指定したURLに遷移
	    driver.get("https://www.yahoo.co.jp");
	    //クッキー名からクッキーを検索
	    Cookie cookie = driver.manage().getCookieNamed("ABC");
	    System.out.println("検索されたクッキーは：" + cookie);
	    //クッキーを指定して削除
	    driver.manage().deleteCookie(cookie);
	    //同じクッキー名からクッキーを検索
	    cookie = driver.manage().getCookieNamed("ABC");
	    System.out.println("検索されたクッキーは：" + cookie);
	  }
	  finally {
          driver.quit();
      }
	}
}
