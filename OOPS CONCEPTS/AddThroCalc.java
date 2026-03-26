import java.util.*;

class Calculator{
public int add(int a, int b){
return a+b;
}
protected int add(int a, int b, int c){
return a+b+c;
}
private double add(double a, double b){
return a+b;
}
public void add2(double a, double b){
double c= add(a,b);
System.out.println("The sum of 2 decimal numbers is:" + c);
}
}
public class AddThroCalc{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
Calculator calc= new Calculator();

System.out.println("Enter two integers to be added:");
int a= sc.nextInt();
int b= sc.nextInt();
System.out.println("The sum of two integers is:" +calc.add(a,b));

System.out.println("Enter three integers to be added:");
int d= sc.nextInt();
int e= sc.nextInt();
int f= sc.nextInt();
System.out.println("The sum of three integers is:" +calc.add(d,e,f));


System.out.println("Enter two decimal numbers to be added:");
double g= sc.nextDouble();
double h= sc.nextDouble();
calc.add2(g,h);
sc.close();

}
}