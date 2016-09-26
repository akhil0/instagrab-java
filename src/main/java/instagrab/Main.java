package instagrab;

import java.io.BufferedReader;
import java.io.InputStreamReader;import java.net.URL;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String curl = args[0];
		URL url = new URL(curl);

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
		    for (String line; (line = reader.readLine()) != null;) {
		        if(line.contains("og:image")) {
		        	String[] lineelems = line.split(" ");
		        	System.out.println(lineelems[6].substring(9, lineelems[6].length()-49));
		        }
		    }
		}

	}

}
