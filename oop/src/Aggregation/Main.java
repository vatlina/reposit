package Aggregation;
/*С использованием агрегации (HAS-A relationship) создать классы Кошелек ( Wallet ) и Деньги ( Money).
        Вывести на печать несколько объектов класса Wallet*/
public class Main {
    public static void main(String[] args) {
        Money money1 = new Money("USD", 220.0);
        Money money2 = new Money("EUR", 360.0);

        Wallet wallet1 = new Wallet(money1);
        Wallet wallet2 = new Wallet(money2);

        System.out.println(wallet1);
        System.out.println(wallet2);
    }
}