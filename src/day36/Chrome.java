package day36;

public class Chrome implements Browser {

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome..");
	}

	@Override
	public void goToURL(String url) {
		System.out.println("Chrome - open page: " + url);
	}

	@Override
	public void clickOnButton(String btnName) {
		System.out.println("Chrome - button clicked: " + btnName);
	}

	@Override
	public void navForward() {
		System.out.println("Chrome - Navigate forward");
	}
	
	@Override
	public void navBack() {
		System.out.println("Chrome - Navigate back");
	}

	@Override
	public String getBrowserName() {
		return "Chrome";
	}
	
}
