public class Main {
    public static void main(String[] args) {
        int userBalance = 100;
        int amount = 1100;

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        userBalance += amount + bonus;

        System.out.println(bonus);
        System.out.println(userBalance);


    }
}