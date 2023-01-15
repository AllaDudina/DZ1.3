public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 2570;
        int grandTotal;

        if (amount >= 1000) {
            grandTotal = account + amount + amount / 100;
        } else {
            grandTotal = account + amount;
        }

        System.out.println("Ваш баланс: " + grandTotal);

    }
}
