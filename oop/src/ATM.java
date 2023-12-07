public class ATM {
    public static void main(String[] args) {
        int amount = 48;//сумма
        int[] result = withdraw(amount);
        System.out.println("Минимальное количество банкнот для суммы " + amount + ":");
        System.out.println("10 долларов: " + result[0]);
        System.out.println("5 долларов: " + result[1]);
        System.out.println("1 доллар: " + result[2]);
    }

    public static int[] withdraw(int amount) {
        int tens = amount / 10;
        int fives = (amount % 10) / 5;
        int ones = (amount % 10) % 5;

        return new int[]{tens, fives, ones};
    }
}
