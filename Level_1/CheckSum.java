

import java.util.Scanner;
class CheckNum{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int arr[]=new int[5];
int n= arr.length;
for(int i=0; i<arr.length; i++) arr[i]=sc.nextInt();
for(int i=0; i<arr.length; i++){
if(arr[i]>0){
 if(arr[i]%2==0){ System.out.println("the number is positive and even");}
	else System.out.println("the number is positive and odd");
}
else if(arr[i]<0) { System.out.println("the number is negative "); }
else {  System.out.println("the number is zero"); }
if(arr[0]==arr[n-1]) { System.out.println("equal"); }
else if(arr[0]>arr[n-1]) { System.out.println("first element  is greater than last element"); }
else { System.out.println(" first element is  smaller than the last element");


}
}
}