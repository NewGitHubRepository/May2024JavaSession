package abstactionPackage;

public abstract class Page {
	// can we create a constructor in abstract class: yes
	
	  public Page() {
		  System.out.println("Page Const -- default"); 
		  }
	 
	
	public Page(int a) {
		System.out.println("Page Const -- param "+ a);
	}
	
	
	
	//abstract methods
	//public abstract final void displayLogo();
	public abstract void getURL();
	public abstract void getTitle();
	
	// non-abstract method 
	public void click() {
		System.out.println("Page - click");
	}
	public void sendKeys() {
		System.out.println("Page-- sendKeys");
	}
	public void loading() {
		System.out.println("Page ---- loading 20 sec");
		
	}

	public final void displayLogo() {
		System.out.println("Page-- dispalyLogo");
	}
}
