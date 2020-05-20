package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[][] mineFieldRandomCreator(int rw, int clmn){
        Random random = new Random();
        int mineField[][] = new int [rw][clmn];
        int i = 0;
        while (i < rw){
            int j = 0;
            while (j < clmn){
                mineField[i][j] = random.nextInt(2);
                j = j + 1;
            }
            i = i + 1;
        }
        for (int k = 0; k < rw; k++){
            for (int l=0; l < clmn; l++){
                System.out.println(mineField[k][l] + " ");}
            System.out.println();
        }
        return mineField;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean control = true;

        System.out.println("Enter the Row Size");
        int a = scanner.nextInt();
        System.out.println("Enter the Column Size");
        int b = scanner.nextInt();
        int [][] mineField = mineFieldRandomCreator(a,b);

        while (control){
            System.out.println("Please select row number");
            int x = scanner.nextInt();
            System.out.println("Please select column number");
            int y = scanner.nextInt();
            if (mineField[x][y] == 1)
            {
                control = false;
            }
            else{
                score = score + 10;
                System.out.println(ConsoleColors.GREEN + "Clear. Go!!!" + ConsoleColors.RESET);
            }
        }
        System.out.println(ConsoleColors.RED + "Game Over Your Score: " + score +ConsoleColors.RESET);
    }
}
