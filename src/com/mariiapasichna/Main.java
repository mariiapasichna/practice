package com.mariiapasichna;

public class Main {

    public static void main(String[] args) {
        BankAccount boss = new BankAccount("Oleg", 0);
        BankAccount ivan = new BankAccount("Ivan", 0);
        BankAccount alex = new BankAccount("Alex", 0);
        BankAccount sergey = new BankAccount("Sergey", 0);

        boss.add(100000);

        boss.transfer(ivan, 10000);
        boss.transfer(alex, 15000);
        boss.transfer(sergey, 20000);

        System.out.println(boss.toString());
        System.out.println(ivan.toString());
        System.out.println(alex.toString());
        System.out.println(sergey.toString());
        System.out.println("Total: " + BankAccount.getTotal());
    }
}
