package com.company;

import java.util.Scanner;

public class PlayerTurnHandler {

    Scanner scan = new Scanner(System.in);
    UserMenu userMenu = new UserMenu();

    String userInput;

    public void takeTurn(Bowler bowler, int frameNumber){

        System.out.println("You are on frame: " + frameNumber);
        userMenu.showTurnMenu();
        userInput = scan.nextLine();

        System.out.println("You chose " + userInput );

    }

}
