package com.bridgelabz.gambling;

public class GamblingProblem {
    final int StakePerGame = 1;
    static int totalStake=0;
    public static void main(String[] args) {
        int perDayStake = 100;
        GamblingProblem gamblingProblem = new GamblingProblem();
        gamblingProblem.isWinOrLoose(gamblingProblem.StakePerGame,perDayStake);
    }
    public void isWinOrLoose(int StakePerGame,int perDayStake){
        int bet = (int)(Math.random() * 2);
        if (bet == 1){
            System.out.println("Win 1$");
            totalStake = StakePerGame + perDayStake;
        }
        else {
            System.out.println("Loose 1$");
            totalStake = perDayStake - StakePerGame;
        }
        System.out.println("Total Stake is "+totalStake);
    }
}