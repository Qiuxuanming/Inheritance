public class StoreOneA extends StoreToRent {
    private static final double DISCOUNT_RATE = 0.1;
    private boolean specialCustomer;
    private double monthlyPayment;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    public void showStoreInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "LOAN DETAILS (if applicable):\n" +
                "Special Customer: " + specialCustomer + "\n" +
                "Monthly Loan Payment: " + calculateLoanFinancing() + "\n";
    }

    @Override
    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }
}    