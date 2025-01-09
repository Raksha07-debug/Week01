
import java.util.Scanner;
class IntOperation{
public static void main (String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter the value for a");
int a= sc.nextInt();
System.out.println("enter the value for b");
int b=sc.nextInt();
System.out.println("enter the value for c");
int c= sc.nextInt();

int x= a + b *c;
int y=a * b + c;
int z= a % b + c;
System.out.println("The results of Int Operations are"+x+" "+y+" "+z);

}
}