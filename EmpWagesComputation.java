import java.util.ArrayList;
import java.util.Scanner;

interface WageMethod	{

	public void computeTotalEmpWage( CompanyEmpWage object );

}

public class EmpWagesComputation implements WageMethod	{
	//here we used constants 
	public final int IS_PART_TIME = 1;
	public final int IS_FULL_TIME = 2;

	ArrayList<Integer> empDailyAndTotalWage = new ArrayList<Integer>();

	//Compute wages 
	public void computeTotalEmpWage( CompanyEmpWage companyEmployee )	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, empDailyWage = 0, empTotalWage = 0;
		while( totalEmpHrs <= companyEmployee.getMaxHrsInMonth() &&
				totalWorkingDays < companyEmployee.getMaxNumOfWorkingDays() )  {
			totalWorkingDays++;
			int empCheck = (int) ( Math.random() * 10 ) % 3;
			switch (empCheck) {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			empDailyWage = empHrs * companyEmployee.getEmpRatePerHour();
			empDailyAndTotalWage.add( empDailyWage );
		}
		empTotalWage = totalEmpHrs * companyEmployee.getEmpRatePerHour();
		empDailyAndTotalWage.add( empTotalWage );
		companyEmployee.setTotalEmpWage( empTotalWage );
	}

	//here we are using main method
	public static void main(String args[]) {

		EmpWagesComputation empwagescomputation = new EmpWagesComputation();

		//declaring an arraylist for company with empobjects
		ArrayList<CompanyEmpWage> company = new ArrayList<CompanyEmpWage>();

		company.add( new CompanyEmpWage( "XCOMPANY", 20, 20, 100 ));
		empwagescomputation.computeTotalEmpWage(company.get(0));

		company.add( new CompanyEmpWage( "YCOMPANY", 30, 20, 70 ));
		empwagescomputation.computeTotalEmpWage(company.get(1));

		while( true )	{
			System.out.println("Enter your choice for aparticular company");
			System.out.println("Press 1 for XCOMPANY");
			System.out.println("Press 2 for YCOMPANY");
			System.out.println("Press 3 to Exit");
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			if( option == 1 )	{
				System.out.println( "The Total Employee Wage of XCOMPANY is: " + company.get(0).getTotalEmpWage() );
			}
			else if( option == 2 )	{
				System.out.println( "The Total Employee Wage of YCOMPANY is: " + company.get(1).getTotalEmpWage() );
			}
			else if( option == 3 )	{
				System.exit(0);
			}
			else	{
				System.out.println("Invalid option");
			}
			System.out.println();
		}
	}
}

class CompanyEmpWage	{

	public String COMPANY_NAME;
	public int EMP_RATE_PER_HOUR;
	public int MAX_NUM_OF_WORKING_DAYS;
	public int MAX_HRS_IN_MONTH;

	public int totalEmpWage = 0;
	//here we use constructor 
	public CompanyEmpWage( String COMPANY_NAME, int EMP_RATE_PER_HOUR, int MAX_NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH )	{
		this.COMPANY_NAME = COMPANY_NAME;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.MAX_NUM_OF_WORKING_DAYS = MAX_NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	//getter method and setter methods
	public String getCompanyName()	{
		return COMPANY_NAME;
	}
	public int getEmpRatePerHour()	{
		return EMP_RATE_PER_HOUR;
	}

	public int getMaxNumOfWorkingDays()	{
		return MAX_NUM_OF_WORKING_DAYS;
	}

	public int getMaxHrsInMonth()	{
		return MAX_HRS_IN_MONTH;
	}

	public void setTotalEmpWage( int totalEmpWage )	{
		this.totalEmpWage = totalEmpWage;
	}

	public int getTotalEmpWage()  {
		return totalEmpWage;
   }
}
