import java.util.*;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected void display() {
        System.out.println("Calculator class has been created.");
    }

    private void show() {
        System.out.println("Private method in Calculator is created");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("Advanced addition:");
        return a + b + 55;
    }

    @Override
    protected void display() {
        System.out.println("This is AdvancedCalculator class");
    }

    public void show() {
        System.out.println("Show method in AdvancedCalculator");
    }
}

public class AdvCalcPOLYMOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();


        Calculator c = new Calculator();
        System.out.println("Base add: " + c.add(a, b));
        c.display();
        c.accessPrivate();

        System.out.println();


        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("Derived add: " + ac.add(a, b));
        ac.display();
        ac.show();

        System.out.println();


        Calculator ref = new AdvancedCalculator();
        System.out.println("Polymorphism add: " + ref.add(a, b));
        ref.display();
        ref.accessPrivate();

        sc.close();
    }
}