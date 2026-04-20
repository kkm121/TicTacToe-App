package com.srm.TicTacToe;

import java.util.Random;

public class UC2TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Toss Result: User won the toss and will play first.");
        } else {
            System.out.println("Toss Result: Computer won the toss and will play first.");
        }
        System.out.println("User Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}