
import java.util.Scanner;
class DoubleOpt {
public static void main (String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter the value for a");
double a= sc.nextInt();
System.out.println("enter the value for b");
double b=sc.nextInt();
System.out.println("enter the value for c");
double c= sc.nextInt();

double x= a + b *c;
double y=a * b + c;
double z= a % b + c;
System.out.println("The results of Int Operations are"+x+" "+y+" "+z);

}
}