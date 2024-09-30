package abstactionPackage;

public class HomePage extends Page{

	@Override
	public void getURL() {
		System.out.println("Homepage------Url");
	}

	@Override
	public void getTitle() {
		System.out.println("Homepage------Title");
		
	}
	
	public void displayWidgets() {
		System.out.println("Homepage-----displayWidgets");
	}

	public void doLogin() {             /// composition
		LoginPage lp = new LoginPage();
		lp.doLogin();
		lp.displayLogo();
	}
	
	
}
