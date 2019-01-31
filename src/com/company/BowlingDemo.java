package com.company;

import java.util.Scanner;

public class BowlingDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UserMenu userMenu = new UserMenu();
        PlayerTurnHandler playerTurnHandler = new PlayerTurnHandler();
        Bowler bowler = new Bowler();


        final String roll = "1";
        final String exitProgram = "2";
        boolean shouldContinue = true;

        int frameCounter = 1;
        String userInput;

        userMenu.showMenu();
        userInput = scan.nextLine();

        do{

          if(userInput.equals(roll)){


            int appropriateFrame = playerTurnHandler.takeTurn(bowler, frameCounter);

            frameCounter = appropriateFrame;

          } else if (userInput.equals(exitProgram)){
              shouldContinue = false;
              System.out.println("Thank you. Goodbye");
          }

      }while(frameCounter <= 10 && shouldContinue);

    }
}
