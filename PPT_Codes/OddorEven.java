import java.util.Scanner;
public class OddOrEven{
public static void main(String[] args){
Scanner input= new Scanner (System.in);
System.out.println("Enter the number to checked:");
int n= input.nextInt();
if (n%2==0){
System.out.println(n+" is Even");
}
else{
System.out.println(n+" is Odd");
}
}}