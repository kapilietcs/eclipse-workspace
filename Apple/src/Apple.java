import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {

public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
	}

}
