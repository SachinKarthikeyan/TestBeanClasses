package Demo_Maven.Demo_MAven;
import java.util.*;


public class Main extends methods{
	
	public static void main(String args[]) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser");
		System.out.println("1.Chrome\n2.Edge\n3.Firefox");
		int n = sc.nextInt();
		switch(n) {
			case 1:
				Chrome();
				input("//div//form//div[@class = 'info']//input[@class = 'fname']","sachin");
				input("//div//form//div[@class = 'info']//input[@placeholder = 'Email']","sachkarthikeyan@gmail.com");
				input("//div//form//div[@class = 'info']//input[@placeholder = 'Phone number']","8438652771");
				input("//div//form//div[@class = 'info']//input[@placeholder = 'Password']","ssssssss");
				selectT("//div//form//div[@class = 'info']//select","Undergraduate");
				click("//div//form//div[@class =\"checkbox\"]//input");
				click("//div//form//button");
				break;
			case 2:
				Edge();
				break;
			case 3:
				FireFox();
				break;
		}
	}
}
