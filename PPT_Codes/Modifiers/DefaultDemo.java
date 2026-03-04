class DefaultDemo {

    int number = 40;   // default access

    void show() {
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        DefaultDemo obj = new DefaultDemo();
        obj.show();
        System.out.println(obj.number);
    }
}