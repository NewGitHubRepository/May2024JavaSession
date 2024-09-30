package interfaceConcept;

public class MaxHospital implements WHO  {

	@Override
	public void GlobalMedicalKit() {
		
		System.out.println("MaxHospital ---GlobalMedicalKit");
	}

	@Override
	public void GenericTest() {
		System.out.println("MaxHospital ---GenericTest");
	}

	@Override
	public void medicalSurvey() {
		System.out.println("MaxHospital ---medicalSurvey");
	}

	//if i want to use fH hosiptal method in max hospital--- composition
	
	public void maxMedicalTraining() {
		FortisHospital fh = new FortisHospital();
		fh.medicalTraining();
	}
	
	//individual method 
	public void maxfacilites() {
		System.out.println("MAX -------maxfacilites");
	}
}
