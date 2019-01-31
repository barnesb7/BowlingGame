package com.company;

public class Frame {

    int totalScore;
    int firstRollScore = 0;
    int secondRollScore = 0;
    String specialCharacters;


    public void scoreFrame(){
//        if(firstRollScore == 10){
//            setTotalScore(10);
//            setSpecialCharacters("x");
//        } else if ()
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
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
