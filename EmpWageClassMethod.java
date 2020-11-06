import java.io.*;
import java.util.Scanner;
class Wages
{
        private int emphrs,emprateperhr,salary=0;
        public Wages(int emphrs,int emprateperhr)
        {
                this.emphrs=emphrs;
                this.emprateperhr=emprateperhr;
        }
        public Wages salaryCal(Wages w1)
        {
                        w1.salary=w1.emphrs*w1.emprateperhr;
                        return w1;
        }
        public void print(Wages w1)
        {
                System.out.println("total salary is "+ w1.salary);
        }
}
public class EmpWageClassMethod
{
        public static void main(String args[])
        {
                Wages w1=new Wages(8,20);
                w1.salaryCal(w1);
                w1.print(w1);
        }
}
