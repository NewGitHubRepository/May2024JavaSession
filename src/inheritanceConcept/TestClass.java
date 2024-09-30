package inheritanceConcept;

public class TestClass {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.engine();
		
		BMW b = new BMW();
		b.autoParking();
		b.start();
		b.stop();
		b.engine();
		b.useAudi();

		Vehical vh = new Vehical();
		vh.engine();
		
	    Audi au= new Audi();
	    au.acFuctionality();
	}

}
