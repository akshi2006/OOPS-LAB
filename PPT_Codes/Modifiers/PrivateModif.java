class PrivateModif {

    private int number = 20;

    private void show() {
        System.out.println("Private Modifier");
    }

    public static void main(String[] args) {
        PrivateModif obj = new PrivateModif();
        obj.show();              // Works
        System.out.println(obj.number);  // Works
    }
}