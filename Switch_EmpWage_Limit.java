/**
 *
 * @authorAditiUpadhyay
 * Functions:Static Program Understandings
 *
 **/
class Switch_EmpWage_Limit {
public static void main(String args[]) {
int wageperhr=20;
int Empworkingdays=0;
int Empworkinghrs=0;

while((Empworkingdays<=20) && (Empworkinghrs<=100)){
int presence=(int)Math.floor(Math.random()*10)%3;
if(presence==0){
Empworkinghrs=8;
}
if(presence==1){
Empworkinghrs=4;
}
Empworkinghrs++;
Empworkingdays++;
}

System.out.println("Wages of Employee:" + (wageperhr*20*8));
System.out.println("Wages of Part-time Worker:" + (wageperhr*20*4));
}
}
