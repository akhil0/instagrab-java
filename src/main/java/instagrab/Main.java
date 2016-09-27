package instagrab;

import java.io.BufferedReader;
import java.io.InputStreamReader;import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String curl = args[0];
		URL url = new URL(curl);

		System.setProperty("webdriver.chrome.driver", "/Users/akhil0/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		  
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
		    for (String line; (line = reader.readLine()) != null;) {
		        if(line.contains("og:image")) {
		        	String[] lineelems = line.split(" ");
		        	String lineop = lineelems[6].substring(9, lineelems[6].length()-49);

		            // And now use this to visit Google
		            driver.get(lineop);
		            
		            //driver.quit();

		        }
		    }
		}

	}

}
