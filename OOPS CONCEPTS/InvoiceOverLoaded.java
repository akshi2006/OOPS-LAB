class InvoiceProcessor {

    public void generateInvoice(String customer, double amount) {
        double finalAmount = calculateTotal(amount);
        System.out.println("Invoice for " + customer);
        System.out.println("Amount: " + finalAmount);
    }

    private double calculateTotal(double amount) {
        System.out.println("Calculating total (Superclass logic)");
        return amount + (amount * 0.10); // 10% tax
    }
}

class RetailInvoice extends InvoiceProcessor {

    @Override
    public void generateInvoice(String customer, double amount) {
        double discountedAmount = applyDiscount(amount);
        System.out.println("Retail Invoice for " + customer);
        System.out.println("Amount after discount: " + discountedAmount);
    }

    public double applyDiscount(double amount) {
        System.out.println("Applying retail discount");
        return amount - (amount * 0.20); 
    }

}

public class InvoiceOverLoaded {
    public static void main(String[] args) {

        InvoiceProcessor processor;

        processor = new RetailInvoice();

        processor.generateInvoice("Akshithaa", 1000);

        System.out.println("\n Using Superclass Object:");

        processor = new InvoiceProcessor();
        processor.generateInvoice("Akshithaa", 1000);
    }
}