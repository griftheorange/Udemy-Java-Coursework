package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] unbalancedArr = {
                {4, 3, 2, 1},
                {6, 7, 2, -12},
                {8, 1, 6, 8},
                {-40, 12, -200}
        };

        int[][] emptyArr = {{}};

        int[][] validArr = {
                {4, 3, 2, 1},
                {6, 7, 2, -12},
                {8, 1, 6, 8},
                {-40, 12, -200, -345},
                {4, 6, 7, 0}
        };

        LLMatrix matrix = new LLMatrix(validArr);
        matrix.printMatrix();
        System.out.println();

        matrix.printRowColumn(2,2);
    }
}
