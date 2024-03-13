package Demo_Maven.Demo_MAven;

import java.util.*;
import org.openqa.selenium.By;
import com.google.errorprone.annotations.Var;

public class Demomethods extends methods{
	

	public static void launchBrowser(String Browser) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Browser:");
		System.out.println("1.Chrome\n2.Edge\n3.Firefox");
		int n = sc.nextInt();
		switch(Browser) {
			case "Chrome":
				Chrome(Chromed, address);
				System.err.println("Chrome web driver is initialized");
				input( By.xpath("//div//form//div[@class='info']//input[@name='name']"), "sachin");
				break;
			case "Edge":
				Edge(Edged, "https://sachinkarthikeyan.github.io");
				System.out.println("Edge web driver is initialized");
				break;
			case "Firefox":
				FireFox(Foxed, "https://sachinkarthikeyan.github.io");
				System.err.println("Firefox web driver is initialized");
				break;
		}
		
	
	}

	
}
