package WebInfo;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	    //Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //指定したURLに遷移する（※下記のアドレスは架空のアドレスです）
	    System.out.println("---保持しているクッキー1---");
	    driver.get("https://www.otameshi.co.jp");
	    //現在のセッションでWebページが保持する全てのクッキーを表示
	    System.out.println("---保持しているクッキー2---");
	    for(Cookie cookie : driver.manage().getCookies()){
	        System.out.println(cookie);
	    }

	}

}
