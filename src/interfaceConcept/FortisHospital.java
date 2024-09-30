package interfaceConcept;

public class FortisHospital implements USMedical, UKMedical, INDMedical{
    //US
	@Override
	public void physicoServices() {
		System.out.println("FH----physicoServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH----oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH----dentalServices");
		
	}
	//UK

	@Override
	public void entServices() {
		System.out.println("FH----entServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH----pediaServices");
		
	}

	@Override
	public void dermaServices() {
		System.out.println("FH----dermaServices");
		
	}
	//IND 

	@Override
	public void cardioServices() {
		
	 System.out.println("FH---------cardioServices");
	}

	@Override
	public void nuroServices() {
		System.out.println("FH---------nuroServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH---------orthoServices");
		
	}
// common method
	@Override
	public void emergencyServices() {
		System.out.println("FH common services===emergencyServices");
	}

	// Indivdual method 
	public void medicalTraining() {
		System.out.println("FH Individual ----medicalTraining");
	}
	
	public void pythologyServices() {
		System.out.println("FH Individual ----pythologyServices");
		orthoServices();
		USMedical.billing();
	}
	
	 public static void billing() {
		  System.out.println("FH---Billing");
	  }
	 
	 
	 @Override
	 public void medicalTest() {
		    System.out.println("FH----medicalTest");
		  }

	@Override
	public void medicalSurvey() {
	  System.out.println("FH - WHO-MedicalSurve");
		
	}

	@Override
	public void GlobalMedicalKit() {
		System.out.println("FH-Hospital ---GlobalMedicalKit");
		
	}

	@Override
	public void GenericTest() {
		System.out.println("FH-Hospital ---GenericTest");
	}

	public void maxfacilitesInFH() {
		MaxHospital max = new MaxHospital();
		max.maxfacilites();
		max.maxMedicalTraining();
		
	}
	 
}
