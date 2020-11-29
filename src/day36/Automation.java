package day36;

public class Automation {
	public static void main(String[] args) {
		
		Browser browser = getBrowserInstance("fairefox");
		
		if (browser instanceof Chrome) {
			System.out.println("Chrome in use");
		} else if (browser instanceof Fairefox) {
			System.out.println("Fairefox in use");
		} else {
			System.out.println("Undefined");
		}
		
		browser.openBrowser();
		browser.goToURL("https://www.google.com");
		
		browser.clickOnButton("search");
		browser.navForward();
		browser.navBack();
		System.out.println("browser: " + browser.getBrowserName());
		// ...
		// 1000 lines of code..
		// ...
	}
	
	private static Browser getBrowserInstance(String browser) {
		switch(browser) {
		case "chrome":
			return new Chrome();
		case "fairefox":
			return new Fairefox();
		default:
			return new Chrome();
		}
	}
}





