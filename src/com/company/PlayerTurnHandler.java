package com.company;

import java.util.Random;
import java.util.Scanner;

public class PlayerTurnHandler {

    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    UserMenu userMenu = new UserMenu();

    String rollBall = "1";
    String seeMyScore = "2";

    boolean inputIsInvalid = true;

    String userInput;

    public void takeTurn(Bowler bowler, int frameNumber) {

        int indexForFrameSearch = frameNumber - 1;

        do {

            System.out.println("You are on frame: " + frameNumber);
            userMenu.showTurnMenu();
            userInput = scan.nextLine();


            if (userInput.equals(rollBall)) {
                int pinsStruckFirstRoll = random.nextInt(11);

                bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).setFirstRollScore(pinsStruckFirstRoll);

                int pinsStruckSecondRoll = random.nextInt(11 - pinsStruckFirstRoll);

                bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).setSecondRollScore(pinsStruckSecondRoll);

                bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).scoreFrame();

                int frameScore = bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).getFrameTotalScore();

                System.out.println("You rolled a " + pinsStruckFirstRoll + " and a " + pinsStruckSecondRoll
                + " for a total of a(n) " + frameScore);

                String frameSpecialCharacter = bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).getSpecialCharacter();

                if(frameSpecialCharacter.equals("strike")){
                    System.out.println("THAT'S A STRIKE! NICE ROLL!");
                } else if (frameSpecialCharacter.equals("spare")){
                    System.out.println("THAT'S A SPARE! NICE ROLL!");
                }

                inputIsInvalid = false;
            } else if (userInput.equals(seeMyScore)) {


                inputIsInvalid = false;
            } else {
                System.out.println("Please choose a valid option from the menu");
            }

        }while(inputIsInvalid);
    }

}
