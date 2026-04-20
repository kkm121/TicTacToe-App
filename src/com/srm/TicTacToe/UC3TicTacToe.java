package com.srm.TicTacToe;

import java.util.Scanner;

public class UC3TicTacToe {

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}