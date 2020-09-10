package WebInfo;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                    "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //指定したURLに遷移する
	    driver.get("https://www.google.co.jp");
	    //カレントウィンドウのサイズを取得
	    Dimension culSize = driver.manage().window().getSize();
	    System.out.println("ウィンドウのサイズは" + culSize);

	}

}
