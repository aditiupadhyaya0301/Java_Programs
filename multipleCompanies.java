import java.io.*;
import java.util.Scanner;
abstract class  Companies
{
        abstract void salCal();
}
class Xcompany extends Companies
{
        int emphrs=4;
        int salary,emprateperhr=20;
        public void salCal()
        {
                salary=emphrs*emprateperhr;
                System.out.println("salary of Xcompany is"+ salary);
        }
}

class Ycompany extends Companies
{
        int emphrs=8;
        int salary,emprateperhr=20;
        public void salCal()
        {
                salary=emphrs*emprateperhr;
                System.out.println("salary of Ycompany is"+ salary);
        }
}

class Zcompany extends Companies
{
        int emphrs=4;
        int salary,emprateperhr=25;
        public void salCal()
        {
                salary=emphrs*emprateperhr;
                System.out.println("salary of Zcompany is"+ salary);
        }
}


public class multipleCompanies
{
        public static void main(String args[])
        {
                Xcompany x1=new Xcompany();
                x1.salCal();
		
                Ycompany y1=new Ycompany();
                y1.salCal();

                Zcompany z1=new Zcompany();
                z1.salCal();

        }

}
