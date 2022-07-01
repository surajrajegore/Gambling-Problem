package com.bridgelabz.gambling;

public class GamblingProblem {
    public static void main(String[] args) {
        int perDayStake = 100;
        final int StakePerGame = 1;

        GamblingProblem gamblingProblem = new GamblingProblem();
        gamblingProblem.playGame(StakePerGame);
    }

    public boolean isWinOrLoose() {
        int bet = (int) (Math.random() * 2);
        if (bet == 1) {
            System.out.println("Win 1$");
            return true;

        } else {
            System.out.println("Loose 1$");
            return false;
        }
    }

    public void playGame(int perDayStake) {
        do {
            int win = 0;
            int loose = 0;
            if (isWinOrLoose()) {
                win += 1;
                perDayStake += win;
                System.out.println("totoalStake" + perDayStake);
            } else {
                loose += -1;
                perDayStake += loose;
                System.out.println("totalStake" + perDayStake);
            }

        } while (perDayStake < 50 || perDayStake >= 150);

    }
}