class PublicModif {

    public int number = 10;

    public void show() {
        System.out.println("Public Modifier");
    }

    public static void main(String[] args) {
        PublicModif obj = new PublicModif();
        obj.show();
        System.out.println(obj.number);
    }
}