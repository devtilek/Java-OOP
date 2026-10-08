package com.example.ClassAndObject.soccerExample;

public class MainExampleForSoccerExample {
    static void main() {

        Player[] players = {
                new Player(1,"Magzhas","Nurgaliev", "ST"),
                new Player(2,"Maga","Nurmanova", "GK"),
                new Player(3,"Make","Nursultan", "CM")
        };

        Club c1 = new Club("Real MAKE", players);

        c1.getClubInfo();
    }
}
