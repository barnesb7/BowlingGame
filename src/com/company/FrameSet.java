package com.company;

import java.util.ArrayList;
import java.util.List;

public class FrameSet {

    List<Frame> frameSet;

    public FrameSet() {
        this.frameSet = new ArrayList<Frame>();

        for (int i = 0; i < 10; i++) {
            frameSet.add(new Frame());
        }

    }

    public int getTotalScoreForAllFrames() {

        int sumOfAllFrameTotalScores = 0;

        for (Frame frame : frameSet) {
            sumOfAllFrameTotalScores += frame.getFrameTotalScore();
        }
        return sumOfAllFrameTotalScores;
    }

    public void adjustScoreOfLastFrameForSpare(int indexOfCurrentFrame) {
        int firstRollOfCurrentFrame = frameSet.get(indexOfCurrentFrame).getFirstRollScore();

        frameSet.get(indexOfCurrentFrame - 1).setFrameTotalScore(10 + firstRollOfCurrentFrame);
    }


    public void adjustScoreOfFrameForStrikeInPreviousFrame(int indexOfCurrentFrame){
        int currentFrameRollOne = frameSet.get(indexOfCurrentFrame).getFirstRollScore();
        int currentFrameRollTwo = frameSet.get(indexOfCurrentFrame).getSecondRollScore();

        frameSet.get(indexOfCurrentFrame - 1).setFrameTotalScore(10 + currentFrameRollOne + currentFrameRollTwo);
    }


    public void adjustScoreOfFrameForStrikeTwoFramesAgo(int indexOfCurrentFrame, String previousFrameSpecialCharacter){

        String currentFrameSpecialCharacter = frameSet.get(indexOfCurrentFrame).getSpecialCharacter();

        if(previousFrameSpecialCharacter.equals("strike") && currentFrameSpecialCharacter.equals("strike")){
            frameSet.get(indexOfCurrentFrame - 2).setFrameTotalScore(30);
        } else if (!previousFrameSpecialCharacter.equals("strike")){
            int previousFrameFirstRoll = frameSet.get(indexOfCurrentFrame - 1).getFirstRollScore();
            int previousFrameSecondRoll = frameSet.get(indexOfCurrentFrame - 1).getSecondRollScore();

            frameSet.get(indexOfCurrentFrame - 2).setFrameTotalScore( 10 + previousFrameFirstRoll + previousFrameSecondRoll);
        }



    }

}
