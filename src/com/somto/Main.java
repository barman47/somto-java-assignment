package com.somto;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

//        int[][][] ORDERS = {
//                {{1, 1, 25, 1},
//                        {2, 3, 150, 2},
//                        {10, 1, 250, 3},
//                        {3, 5, 375, 4},
//                        {3, 2, 150, 5}
//                },
//                {{2, 2, 40, 0},
//                        {2, 2, 40, 1},
//                        {8, 1, 80, 2}, //not in P3
//                        {2, 5, 100, 3},
//                        {6, 2, 100, 4},
//                        {2, 1, 200, 5},
//                        {1, 2, 200, 6}
//                },
//                {{2, 1, 500, 0}, //fits in P1, P2 alone
//                        {1, 1, 600, 1}, //never fits (too heavy, if 0 is in)
//                        {5, 10, 200, 2}, //never fits
//                        {10, 5, 500, 3}  //fits in P3, then alone
//                }
//        };
//        for (int [][] orders: ORDERS) {
//            for (int [] product: orders) {
//                System.out.print(Arrays.toString(product) + "\n");
//            }
//            System.out.println("");
//        }

        int [][] order = Data.getOrder(2);
        for (int[] product: order) {
            System.out.println(Arrays.toString(product));
        }

    }

    private void doAssignment () {

    }
}
