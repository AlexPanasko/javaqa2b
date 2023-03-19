public class Main {
    public static void main(String[] args) {
        int startingBalance = 400;
        int refill = 1100;

        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        }

        int finalBalance = startingBalance + refill + bonus;
        System.out.println("Баланс: " + finalBalance);
        System.out.println("Бонус: " + bonus);

    }
}