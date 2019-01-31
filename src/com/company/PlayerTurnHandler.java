package com.company;

import java.util.Random;
import java.util.Scanner;

public class PlayerTurnHandler {

    private Random random = new Random();
    private Scanner scan = new Scanner(System.in);
    private UserMenu userMenu = new UserMenu();

    private String rollBall = "1";
    private String seeMyScore = "2";

    private boolean inputIsInvalid = true;
    private boolean showScoreWasCalled = false;

    String userInput;

    public int takeTurn(Bowler bowler, int frameNumber) {

        int indexForFrameSearch = frameNumber - 1;

        do {

            System.out.println("You are on frame: " + frameNumber);
            userMenu.showTurnMenu();
            userInput = scan.nextLine();


            if (userInput.equals(rollBall)) {

                showScoreWasCalled = false;

                int pinsStruckFirstRoll = random.nextInt(11);

                bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).setFirstRollScore(pinsStruckFirstRoll);

                int pinsStruckSecondRoll = random.nextInt(11 - pinsStruckFirstRoll);

                bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).setSecondRollScore(pinsStruckSecondRoll);

                bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).scoreFrame();

                int frameScore = bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).getFrameTotalScore();

                System.out.println("You rolled a " + pinsStruckFirstRoll + " and a " + pinsStruckSecondRoll
                + " for a total of " + frameScore + "\n");

                String frameSpecialCharacter = bowler.bowlerFrameSet.frameSet.get(indexForFrameSearch).getSpecialCharacter();

                if(frameSpecialCharacter.equals("strike")){
                    System.out.println("THAT'S A STRIKE! NICE ROLL! \n");
                } else if (frameSpecialCharacter.equals("spare")){
                    System.out.println("THAT'S A SPARE! NICE ROLL! \n");
                }

                inputIsInvalid = false;
            } else if (userInput.equals(seeMyScore)) {

              int bowlersTotalScore =  bowler.bowlerFrameSet.getTotalScoreForAllFrames();

                System.out.println("Your current score is " + bowlersTotalScore + '\n');

                showScoreWasCalled = true;
                inputIsInvalid = false;
            } else {
                System.out.println("Please choose a valid option from the menu");
            }

        }while(inputIsInvalid);

        return locateAppropriateFrame(frameNumber);
    }


    private int locateAppropriateFrame(int frameNumber) {
        if(showScoreWasCalled){
            return frameNumber;
        } else {
            return frameNumber + 1;
        }
    }



}
