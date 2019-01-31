package com.company;

public class Frame {

    private int frameTotalScore;
    private int firstRollScore = 0;
    private int secondRollScore = 0;
    private String specialCharacters;


    public void scoreFrame(){
//        if(firstRollScore == 10){
//            setTotalScore(10);
//            setSpecialCharacters("x");
//        } else if ()
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
        this.firstRollScore = firstRollScore;
    }

    public int getSecondRollScore() {
        return secondRollScore;
    }

    public void setSecondRollScore(int secondRollScore) {
        this.secondRollScore = secondRollScore;
    }

    public void setSpecialCharacters(String character){
        this.specialCharacters = character;
    }
}
