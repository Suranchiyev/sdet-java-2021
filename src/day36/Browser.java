package day36;

public interface Browser {	
	public abstract void openBrowser();
	
	public abstract void goToURL(String url);
	
	public abstract void clickOnButton(String btnName);
	
	public abstract void navForward();
	
	public abstract void navBack();
	
	public abstract String getBrowserName();
}

//Break till 11:13 AM EST