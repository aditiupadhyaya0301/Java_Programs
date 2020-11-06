/**
 *
 * @authorAditiUpadhyay
 * Functions:Static Program Understandings
 *
 */
class CheckAttendance {
public static void main(String args[]) {
int attendance=(int)Math.floor(Math.random()*10)%2;
if(attendance==0){
System.out.println("Employee is absent");
}
if(attendance==1){
System.out.println("Employee is present");
}
}
}
