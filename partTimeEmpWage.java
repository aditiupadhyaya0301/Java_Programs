/**
 *
 * @authorAditiUpadhyay
 * Functions:Static Program Understandings
 *
 */
class PartTimeEmpWage {
public static void main(String args[]) {
int wageperhr=20;
int hrs=8;
int wages=wageperhr*hrs;
int Part_timehrs=4;
int Part_timewages=wageperhr*Part_timehrs;
int presence=(int)Math.floor(Math.random()*10)%3;
if(presence==0){
System.out.println("Employee is absent");
}
if(presence==1){
System.out.println("Employee is present");
System.out.println("Wages:"+ wages);
}

if(presence==2){
System.out.println("Part-time Employee is present");
System.out.println("Wages:"+ Part_timewages);
}
}
}
