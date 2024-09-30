package interfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.dermaServices();
		fh.physicoServices();
		fh.entServices();
		
		fh.emergencyServices();
		System.out.println("=========================");

		// we can't create instance of interface - it will through the compile time error
		//USMedical us = new USMedical();
		
		//Top casting
		USMedical us= new FortisHospital();
		us.dentalServices();
		us.oncologyServices();
		us.physicoServices();
		us.emergencyServices();
		
		//Down casting == not allowed
		//FortisHospital fh1 = new USMedical();
		System.out.println("======================");
		fh.pythologyServices();
		fh.medicalTraining();
		
		USMedical.billing();
		FortisHospital.billing();
		
		fh.medicalTest();
		us.medicalTest();
		System.out.println("==========================");
		fh.medicalSurvey();
		us.medicalSurvey();
		UKMedical uk= new FortisHospital();
		uk.medicalSurvey();
		
		MaxHospital max = new MaxHospital();
		max.GenericTest();
		max.GlobalMedicalKit();
		max.maxMedicalTraining();//use FH method in Max using composition (create obj of FH and call that method inside max method) 
		fh.GenericTest();
		fh.GlobalMedicalKit();
		fh.maxfacilitesInFH(); //use max individual method in Max method using composition 
		
		
		
	}

}
