import java.util.*;
public class Factorial{
public static void main(String args[]){
System.out.println("Enter the number to find its factorial:");
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int fact=1;
int x=n;
while (n>0){
fact=fact*n;
n--;
}
System.out.println("The factorial of  " +x+ " is " + fact);
}
}