
/**
 *
 * @authorAditiUpadhyay
 * Functions:Static Program Understandings
 *
 */
class DailyEmpWage {
public static void main(String args[]) {
int wageperhr=20;
int hrs=8;
int wages=wageperhr*hrs;
int presence=(int)Math.floor(Math.random()*10)%2;
if(presence==0){
System.out.println("Employee is absent");
}
if(presence==1){
System.out.println("Employee is present");
System.out.println("Wages:"+ wages);
}

}
}
