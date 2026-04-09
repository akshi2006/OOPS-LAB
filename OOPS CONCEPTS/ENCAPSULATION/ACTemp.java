class AC {
    private int temperature = 24;

    public void SetTemp(int temp) {
        if (temp >=16 && temp <=30) {
            temperature = temp;
            System.out.println("Temperature set to " + temperature + " degrees.");
        } else {
            System.out.println("Temperature must be between 16 and 30 degrees.");
        }
    }

    public void increaseTemp() {
        if (temperature < 30) {
            temperature++;
            System.out.println("Temperature increased to " + temperature + " degrees.");
        } else {
            System.out.println("Temperature is already at maximum (30 degrees).");
        }
    }

    public void decreaseTemp() {
        if (temperature > 16) {
            temperature--;
            System.out.println("Temperature decreased to " + temperature + " degrees.");
        } else {
            System.out.println("Temperature is already at minimum (16 degrees).");
        }
    }

    public void displaytemp() {
        System.out.println("Current temperature: " + temperature + " degrees.");
    }
}

public class ACTemp {
    public static void main(String args[]) {
        AC ac = new AC();

        ac.SetTemp(22);
        ac.increaseTemp();
        ac.decreaseTemp();
        ac.displaytemp();
    }
}