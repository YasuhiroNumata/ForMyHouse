package WebInfo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Chrome制御のためChromeDriverのパスを指定
	    System.setProperty("webdriver.chrome.driver",
	                                        "C:\\ws2020\\Test1021\\exe\\chromedriver.exe");
	    //Chromeを起動する
	    WebDriver driver = new ChromeDriver();
	    //指定したURLに遷移する<図1>
	    driver.get("file://C:\\ws2020\\Test1021\\html\\getWindowHandles.html");
	    //それぞれのテキスト名のリンク要素を取得
	    WebElement link1 = driver.findElement(By.linkText("Yahoo Top"));
	    WebElement link2 = driver.findElement(By.linkText("Firefox Top"));
	    WebElement link3 = driver.findElement(By.linkText("Opera Top"));
	    //少々待機する
	    try{
	        Thread.sleep(3000);
	       }catch (InterruptedException e){
	    }
	    //ローカルファイル内のYahooへのリンクをクリックし新規ウィンドウを立ち上げる
	    link1.click();
	    //ローカルファイル内のFirefoxへのリンクをクリックし新規ウィンドウを立ち上げる
	    link2.click();
	    //ローカルファイル内のOperaへのリンクをクリックし新規ウィンドウを立ち上げる
	    link3.click();
	    //少々待機する
	    try{
	        Thread.sleep(5000);
	       }catch (InterruptedException e){
	    }
	    //全てのウィンドウハンドルを取得
	    Set<String> set = driver.getWindowHandles();
	    //それぞれのウインドウハンドルを別々の変数に保存
	    Iterator<String> it = set.iterator();
	    //ウィンドウハンドル１
	    String window1 = it.next();
	    System.out.println(window1);
	    //ウィンドウハンドル２
	    String window2 = it.next();
	    System.out.println(window2);
	    //ウィンドウハンドル３
	    String window3 = it.next();
	    System.out.println(window3);
	    //ウィンドウハンドル４
	    String window4 = it.next();
	    System.out.println(window4);
	    //getWindowHandles.htmlの内容からMSNページへ移行した
	    driver.switchTo().window(window1).get("https://www.msn.com");
	    //OperaページからGoogleページへ移行した
	    driver.switchTo().window(window2).get("https://www.google.com");
	    //FirefoxページからMicrosoftページへ移行した
	    driver.switchTo().window(window3).get("https://www.microsoft.com");

	}

}
