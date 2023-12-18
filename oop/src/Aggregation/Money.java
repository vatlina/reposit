package Aggregation;

class Money {
    private String currency;
    private double amount;

    public Money(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}