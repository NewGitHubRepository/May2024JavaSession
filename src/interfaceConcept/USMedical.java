package interfaceConcept;

public interface USMedical extends WHO{
  public void physicoServices();
  public void oncologyServices();
  public void dentalServices();
  
  public void emergencyServices();
  
  // Static method with body is allowed in interface(afterJDK 1.8)
  public static void billing() {
	  System.out.println("US---Billing");
  }
  
  default void medicalTest() {
    System.out.println("US----medicalTest");
  }
  
}

