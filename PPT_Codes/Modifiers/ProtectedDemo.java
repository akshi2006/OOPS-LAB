class ProtectedDemo {

    protected int number = 30;

    protected void show() {
        System.out.println("Protected Method");
    }

    public static void main(String[] args) {
        ProtectedDemo obj = new ProtectedDemo();
        obj.show();
        System.out.println(obj.number);
    }
}