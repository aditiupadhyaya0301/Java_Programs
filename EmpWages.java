import java.util.Scanner;
public class EmpWages
{
	
		private final String company;
		private final int  num_working_days;
		private final int max_hours_month;
		private final int emprateperhr;
		private int totalwages;

		public EmpWages(String company,int num_working_days,int max_hours_month,int emprateperhr)	
		{
			
			this.company=company;
			this.num_working_days=num_working_days;
			this.max_hours_month=max_hours_month;
			this.emprateperhr=emprateperhr;

		}
		public String toString()
   	{
      	return ("total wages of a company is" +company+" "+totalwages);
   	}

		public void calEmpWage()
		{
					int emphrs=0,totalemphrs=0,totalworkingdays=0;
				 Scanner sc=new Scanner(System.in);
             int  empcheck=sc.nextInt();

			while(totalemphrs<max_hours_month&&totalworkingdays<num_working_days)
			{
					totalworkingdays++;	
				   System.out.println("enter choice for emphrs ");
				 switch(empcheck)
	         {
   	         case 1:
            	   emphrs=4;
               	break;
      	      case 2:
         	      emphrs=8;
               	break;
            	default:
               	emphrs=0;
               	break;
         	}

				totalemphrs=totalemphrs+emphrs;
				System.out.println("day is"+totalworkingdays+" "+"hrs is"+totalemphrs);
			}
			totalwages=totalemphrs*emprateperhr;
			System.out.println("total salary per month is "+totalwages);
	}
	public static void main(String args[])
	{
		EmpWages x1=new EmpWages("Xcompany",20,4,25);
		EmpWages x2=new EmpWages("Ycompany",24,3,20);
		x1.calEmpWage();
		System.out.println(x1);
		 x2.calEmpWage();
      System.out.println(x2);
	}
}
