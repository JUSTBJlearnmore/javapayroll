// WORK DONE BY BETTYE TAYLOR / PROGRAMER COMPLETEED WORK IN 2.5 HOURS / 
// Program inputs employee information (name, hours worked, hourly pay, federal & state w/h
// and returns employee payroll information
// Input: employeeName (string)
// Input: hoursWorked (integer)
// Input: hourlyPay (decimal)
// Input: federalWithholding (decimal)
// Input: stateWithholding (decimal)
// Output: employeeName, hoursWorked, hourlyPay, grossPay
// Output: federalWithheld, stateWithheld, totalWithheld
// Output: netPay
// NOTE: Your input and output MUST match the format provided in the samples.
// NOTE: When outputting currency, you MUST use printf, not the "trick" we were using before.
// NOTE: You MUST use appropriate selection logic to validate user input. Use the assumptions 
//		 below to guide you on what to validate. Output appropriate error message as necessary. 
//		 This isn't shown in the samples so create appropriate messages for the input error.
// NOTE: You create your own variables. Make sure they have meaningful names and appropriate types.
// Assumption: all inputs are non-negative
// Assumption: there is no overtime pay (hours must be no more then 40)
// Assumption: tax withholding rates are between 0.0 - 1.0
import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
	
	// Prompt for employee information
	System.out.print("Enter employee's last name: ");
	String lastName = input.nextLine();
	
	System.out.print("Enter number of hours worked this week: ");
	double hoursWorked = input.nextDouble();
	
	System.out.print("Enter hourly pay rate: $");
	double payRate = input.nextDouble(); 
	
	System.out.print("Enter federal tax withholding rate: ");
	double  federalTaxRate = input.nextDouble();
	
	System.out.print("Enter state tax withholding rate: ");
	double stateTaxRate = input.nextDouble();
	
	
	//Calculate Payroll Information 
	double grossPay = hoursWorked * payRate;
	double federalWithholding = grossPay * federalTaxRate;
	double stateWithholding = grossPay * stateTaxRate;
	double totalDeduction = federalWithholding + stateWithholding;
	double netPay = grossPay - totalDeduction;
	
	// Print Payroll Report 
	System.out.printf("\nEmployees Name: %s\n", lastName);
	System.out.printf("Hours Worked: %.1f\n", hoursWorked);
	System.out.printf("Pay Rate: $%.2f\n", payRate);
	System.out.printf("Gross Pay: $%.2f\n", grossPay);
	System.out.println("Deductions: ");
	System.out.printf("\tFederal Withholding (%.1f%%): (%.2f\n", federalTaxRate * 100, federalWithholding);
	System.out.printf("\tState Withholding (%.1f%%): (%.2f\n", stateTaxRate * 100, stateWithholding);
	System.out.printf("\tTotal Deduction: $%.2f\n" , totalDeduction);
	System.out.printf(" Net Pay: $%.2f\n", netPay);
	} 
}
