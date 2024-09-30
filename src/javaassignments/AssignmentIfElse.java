package javaassignments;

public class AssignmentIfElse {

	public static void main(String[] args) {
		//1.WAP to check number is odd or even using If - Else
		int num = 21;
		if (num%2 == 0) {
			System.out.println("Its a even number : "+ num);
		}else {
			System.out.println("Its a odd number : "+ num);
		}
		
	//2.WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		char ch = 't';
		
		switch (ch) {
		case 'a':
            System.out.println("Its a vowel : "+ ch);
			break;
		case 'e':
			System.out.println("Its a vowel : "+ ch);
			break;
		case 'i':
			System.out.println("Its a vowel : "+ ch);
			break;
		case 'o':
			System.out.println("Its a vowel : "+ ch);
			break;
		case 'u':
			System.out.println("Its a vowel : "+ ch);
			break;

		default:
			System.out.println("Its a consonant : "+ ch);
			break;
		}
		 
		//3.WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod 
		//using using Switch - Case
		
		String env = "UAT ";
		
		switch (env.toLowerCase().trim()) {
		case "qa":
			System.out.println("Switch to QA environment");
			break;
		case "stage":
			System.out.println("Switch to STAGE environment");
			break;
		case "dev":
			System.out.println("Switch to DEV environment");
			break;
		case "uat":
			System.out.println("Switch to UAT environment");
			break;
		case "prod":
			System.out.println("Switch to PROD environment");
			break;

		default:
			System.out.println("Please select a specific environment");
			break;
		}
		
	//4.WAP to book the specific type of car from the Uber app using Switch - Case. 
//Car Type: Mini, Sedan, SUV, Premium
//If user passes wrong car type, print please select the right car type
		
		String car="crept";
		switch (car.toLowerCase().trim()) {
		case "mini":
			System.out.println("Successfully Booked the specific "+car+" car from the Uber app");
			break;
		case "sedan":
			System.out.println("Successfully Booked the specific "+car+" car from the Uber app");
			break;
		case "suv":
			System.out.println("Successfully Booked the specific "+car+" car from the Uber app");
			break;
		case "premium":
			System.out.println("Successfully Booked the specific "+car+" car from the Uber app");
			break;
		default:
			System.out.println("Sorry ,Please select the right car type");
			break;
		}
		
	//5.WAP to launch browsers using If-ElseIf and Switch Case.
//Browser: Chrome/Firefox/IE/Safari
//If user passes wrong browser, print please pass the right browser name
		//doubt: why "ie" browser is not printed in console in if-else code
		String browser = "IE ";
		String browser1 = browser.toLowerCase().trim();
		switch (browser1) {
		case "chrome":
			System.out.println("Lunch the chrome browser");
			break;
		case "firefox":
			System.out.println("Lunch the firefox browser");
			break;
		case "ie":
			System.out.println("Lunch the IE browser");
			break;
		case "safari":
			System.out.println("Lunch the Safari browser");
			break;

		default:
			System.out.println("please pass the right browser name");
			break;
		}
		
		//with if -elseif
		
		if (browser1.equals("chrome")) {
			System.out.println("Lunch the chrome browser");
		}else if (browser1.equals("firefox")) {
			System.out.println("Lunch the firefox browser");
		}else if (browser1.equals("ie")) {
			System.out.println("Lunch the IE browser");
		}else if (browser1.equals("safari")) {
			System.out.println("Lunch the safari browser");
		}else {
			System.out.println("please pass the right browser name");
		}
		
//WAP to define the interest rate on the basis of Loan type using Switch Case
//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
	String loanType = "Housing loan";
	double salary = 30000;
	double interestRate = 0.0;
	switch (loanType) {
	case "Car Loan":
		interestRate  = 6.5;
		break;
	case "Housing loan":
		if(salary < 35000) {
		System.out.println(" NOT APPLICABLE FOR Housing Loan");	
		}
		interestRate = 7.5;
		break;
	case "Personal Loan":
		interestRate  = 10.0;
		break;
	case "Education Loan":
		interestRate  = 8.0;
		break;
	default:
		System.out.println("please select the valid loan type");
		break;
	}
	System.out.println("Interest rate for "+ loanType + " is "+ interestRate+ "%");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
