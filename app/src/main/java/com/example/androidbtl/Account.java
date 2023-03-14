package com.example.androidbtl;

public class Account {

    private int id;
    private String account_name;
    private float money;

    public Account(int id, String account_name, float money) {
        this.id = id;
        this.account_name = account_name;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public float getMoney() {
        return money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public void setMoney(float money) {
        this.money = money;
    }

}
