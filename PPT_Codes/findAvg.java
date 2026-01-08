public class findAvg{
public int findAvg(int numA, int numB,int numC){
return (numA + numB + numC)/3;
}
public static void main(String args[]){
findAvg obj = new findAvg();
int avg = obj.findAvg(10,20,30);
System.out.println("The average of 10,20 and 30 is:" + avg);
}
}