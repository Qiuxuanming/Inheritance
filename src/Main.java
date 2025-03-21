public class Main {
    public static void main(String[] args) {
        StoreOneA store = new StoreOneA(true, 100000, 12, true);
        store.enterStoreDetails();
        store.showStoreInfo();
        double monthlyPayment = store.calculateLoanFinancing();
        System.out.println("Monthly Loan Payment: " + monthlyPayment);
    }
}    