package com.example.ClassAndObject.soccerExample;

public class Club {
    private String name;
    private Player[] players;

    private Club(){}

    Club(String name, Player[] players){
        this.name = name;
        this.players = players;
    }

    public void getClubInfo(){
        System.out.println("Футбольный клуб: " + name);
        System.out.println("Состав команды: ");

        if (players == null || players.length == 0){
            System.out.println("В команде пока нет игроков");
            return;
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].toString());
        }
    }

}
