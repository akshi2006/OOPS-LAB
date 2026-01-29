import java.util.*;
public class StudentsMark{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
boolean result;
do{
System.out.println("Enter marks in Maths:");
int mat = sc.nextInt();
System.out.println("Enter marks in English:");
int eng = sc.nextInt();
System.out.println("Enter marks in Science:");
int sci = sc.nextInt();
System.out.println("Enter marks in Computer Science:");
int comp = sc.nextInt();
System.out.println("Enter marks in Social Science:");
int soc = sc.nextInt();
double finalscore=(mat+eng+sci+soc+comp)/5.0;
if (finalscore>=90){
System.out.println("A grade");
}
else if (finalscore >=80){
System.out.println("B grade");
}
else if (finalscore >=70){
System.out.println(" C grade");
}
else if (finalscore >=60){
System.out.println(" D grade");
}
else if (finalscore >=50){
System.out.println("E grade");
}
else {
System.out.println("Fail");
}
System.out.println("Are there any more students?");
 result = sc.nextBoolean();

}
while (result);
}
}






