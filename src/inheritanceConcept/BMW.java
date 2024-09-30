package inheritanceConcept;

public class BMW extends Car{

	public void autoParking() {
		System.out.println("BMW-----------AutoParking");
	}
	@Override
	public void start() {
		System.out.println("BMW--------Start");
	}
	@Override
	public void engine() {
    	System.out.println("BMW------engine");
    }
	
	//if i want to use audi methods in BMW class - pls follow below(Relationship in sibling class)
	public void useAudi() {
		Audi au = new Audi();
		au.acFuctionality();
	}
	
	
}
