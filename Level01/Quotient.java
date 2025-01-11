import java.util.Scanner;
class Quotient{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int number=sc.nextInt();
System.out.println("enter first number");
int divisor=sc.nextInt();
int[] result = findRemainderAndQuotient(number, divisor); System.out.println("Quotient: " + result[0]); System.out.println("Remainder: " + result[1]);

}
public static int[] findRemainderAndQuotient(int number, int divisor) 
{
int quotient=number/10;
int remainder=number%10;
int a[]={quotient,remainder};
return a;	
}
}