package com.example.Interfaces.ex3;

public class BankApplication implements BankApplInterface{
    private Account[] accounts = new Account[100];
    private int indexOfAccount = 0;

    @Override
    public void addAccount(Account account) {
        if (account != null){
            accounts[indexOfAccount] = account;
            indexOfAccount++;
        }
    }

    @Override
    public void printAllAccounts() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null){
                System.out.println(accounts[i]);
            }
        }
    }

    @Override
    public void getInfoAboutAccountById(int id) {
        for (int i = 0; i < accounts.length; i++) {
            if (id == accounts[i].getId() && accounts[i] != null){
                System.out.println(accounts[i]);
                break;
            }
        }
    }

    @Override
    public void deleteAccountById(int id) {
        for (int i = 0; i < accounts.length; i++) {
            if (id == accounts[i].getId()){
                accounts[i] = null;
                break;
            }
        }
    }
}
