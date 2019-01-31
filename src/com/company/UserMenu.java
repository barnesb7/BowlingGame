package com.company;

public class UserMenu {

    String rollOption = "[1] Roll!";
    String exitOption = "[2] Exit Game";

    public void showMenu(){
        System.out.println(rollOption + " or " + exitOption);
    }

    public void showTurnMenu(){

        System.out.println("[1] ROLL  [2] See My Score");
    }

}
