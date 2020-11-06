import java.util.Scanner;
public class EmpWagesSwitchCases
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int empworkercheck=sc.nextInt();
		
		int salary;
		int emprateperhr=20;
		switch(empworkercheck)
		{
			case 1:
				int  part_time_hr=4;
				salary=part_time_hr*emprateperhr;
				System.out.println("employee wages per part time is " +salary);
				break;
			case 2:
				 int  full_time_hr=8;
                                salary=full_time_hr*emprateperhr;
                                System.out.println("employee wages per full time is "+salary);  
                                break;
			default :
					int emphrs=0;
					 salary=emphrs*emprateperhr;
                                System.out.println("employee is not present " +salary);
				break;
		}
	}
}
