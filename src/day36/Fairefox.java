package day36;

public class Fairefox implements Browser {
	@Override
	public void openBrowser() {
		System.out.println("Open Fairefox..");
	}

	@Override
	public void goToURL(String url) {
		System.out.println("Fairefox - open page: " + url);
	}

	@Override
	public void clickOnButton(String btnName) {
		System.out.println("Fairefox - button clicked: " + btnName);
	}

	@Override
	public void navForward() {
		System.out.println("Fairefox - Navigate forward");
	}
	
	@Override
	public void navBack() {
		System.out.println("Fairefox - Navigate back");
	}

	@Override
	public String getBrowserName() {
		return "Fairefox";
	}
	
}
