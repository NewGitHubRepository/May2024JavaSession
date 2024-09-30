package abstactionPackage;

public class LoginPage extends Page{
 // constructor in child class
	public LoginPage() {
		System.out.println("LoginPage ---- default const");
	}
	public LoginPage(int a) {
		System.out.println("LoginPage ---- param const"+ a);
	}

	@Override
	public void getURL() {
	System.out.println("LoginPag -getURL");
		
	}

	@Override
	public void getTitle() {
		System.out.println("LoginPage - getTitle");
		
	}
	
	
	  @Override // parent non-abstract method we can override in child 
	  public void loading() {
	   System.out.println("LoginPage ---- loading 5 sec");
	   
	    }
	 
	//individual method
	public void doLogin() {
		System.out.println("LoginPage ---- Login to app");
	}
	
	/* we can't override final method 
	 * public final void displayLogo()
	 *  { 
	 *  System.out.println("Page-- dispalyLogo");
	 *   }
	 */
	
	
    
}
