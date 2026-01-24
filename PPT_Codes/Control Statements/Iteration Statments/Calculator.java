import java.util.Scanner;
public class Calculator{
public static void main(String args[]){
double n1,n2,n3;
char op;
Scanner calc= new Scanner(System.in);

System.out.print("Enter the first number:");
n1=calc.nextDouble();
System.out.print("Enter the second number:");
n2=calc.nextDouble();
System.out.print("Enter the operator:");
op=calc.next().charAt(0);
switch(op){
case '+':
n3=n1+n2;
break;
case '-':
n3=n1-n2;
break;
case '*':
n3=n1*n2;
break;
case'/':
n3=n1/n2;
break;
default:
n3=0;
}
System.out.println("Output:" +n3);
}
}
 