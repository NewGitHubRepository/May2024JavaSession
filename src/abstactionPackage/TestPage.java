package abstactionPackage;

public class TestPage {

	public static void main(String[] args) {
		//LoginPage lp = new LoginPage();
		LoginPage lp = new LoginPage(10);
		lp.displayLogo(); //  we can't override final method but we can call through child class
		lp.getTitle();
		lp.getURL();
		lp.loading();
		lp.click();
		lp.sendKeys();
		lp.doLogin();
       System.out.println("=============================");
		//Page p = new Page(); /// can't create the obj of abstract class : not allowed
		
		Page pg = new LoginPage(); /// we can do top casting 
		pg.click();
		pg.sendKeys();
		pg.displayLogo();
		pg.loading();
		pg.getTitle();
		pg.getURL();
		//pg.doLogin();
		
		System.out.println("========================");
		HomePage hp = new HomePage();
		hp.getTitle();
		hp.getURL();
		hp.displayLogo();
		hp.loading();
		hp.displayWidgets();
		hp.click();
		hp.sendKeys();
		hp.doLogin();
		
	}

}
