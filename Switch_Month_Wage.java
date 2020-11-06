/**
 *
 * @authorAditiUpadhyay
 * Functions:Static Program Understandings
 *
 */
class Switch_Month_Wage {
public static void main(String args[]) {
int wageperhr=20;
int hrs=8;
int wages=wageperhr*hrs;
int Part_timehrs=4;
int Part_timewages=wageperhr*Part_timehrs;
int presence=(int)Math.floor(Math.random()*10)%3;
switch (presence) {
case 0:
System.out.println("Employee is absent");
break;
case 1:
System.out.println("Employee is present");
System.out.println("Wages:" +wages);
break;
case 2:
System.out.println("Employee is part_time worker");
System.out.println("Wages:" +Part_timewages);
break;

}
}
}

