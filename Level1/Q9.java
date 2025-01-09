
import java.util.Scanner;
class Q9{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int fee=sc.nextInt();
int discountPercent=sc.nextInt();
int disVar=(fee*discountPercent)/100;
int disFee=fee-disVar;


System.out.println("The discount amount is INR "+disVar+"and final discounted fee is INR "+disFee);

}
}