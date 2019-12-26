package com.mariiapasichna;

public class BankAccount {
    private static double total;
    private String name;
    private double count;
    private double commission;

    public BankAccount(String name, double count, double commission) {
        this.name = name;
        this.count = count;
        this.commission = commission;
    }

    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

    public static double getTotal() {
        return total;
    }

    public static void setTotal(double total) {
        BankAccount.total = total;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setCount(double count) {
        this.count = count;
    }

    // 0.5% commission
    public void add(double money) {
        this.count = this.count + money * 0.995;
        setCommission(money * 0.005);
        setTotal(money * 0.005);
    }

    // 1% commission
    public void transfer(BankAccount otherPerson, double money) {
        this.count = this.count - money;
        otherPerson.setCount(money * 0.99);
        otherPerson.setCommission(money * 0.01);
        setTotal(total + otherPerson.getCommission());
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", commission=" + commission +
                '}';
    }
}