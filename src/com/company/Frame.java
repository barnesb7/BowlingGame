package com.company;

public class Frame {

    private int frameTotalScore;
    private int firstRollScore = 0;
    private int secondRollScore = 0;
    private String specialCharacter = "regularRoll";


    public void scoreFrame(){

        if (firstRollScore == 10){
            setFrameTotalScore(10);
            setSpecialCharacter("strike");
        } else if(firstRollScore + secondRollScore < 10){
            setFrameTotalScore(firstRollScore + secondRollScore);
        } else if (firstRollScore + secondRollScore == 10){
            setFrameTotalScore(10);
            setSpecialCharacter("spare");
        }
    }

    public int getFrameTotalScore() {
        return frameTotalScore;
    }

    public void setFrameTotalScore(int frameTotalScore) {
        this.frameTotalScore = frameTotalScore;
    }

    public int getFirstRollScore() {
        return firstRollScore;
    }

    public void setFirstRollScore(int firstRollScore) {
        System.out.println("First Roll before --> " + this.firstRollScore);
        this.firstRollScore = firstRollScore;
        System.out.println("First Roll after --> " + this.firstRollScore);

    }

    public int getSecondRollScore() {
        return secondRollScore;
    }

    public void setSecondRollScore(int secondRollScore) {
        System.out.println("Second Roll before--> " + secondRollScore);
        this.secondRollScore = secondRollScore;
        System.out.println("Second Roll after--> " + secondRollScore);
    }

    public void setSpecialCharacter(String character){
        this.specialCharacter = character;
    }

    public String getSpecialCharacter(){
        return specialCharacter;
    }
}
