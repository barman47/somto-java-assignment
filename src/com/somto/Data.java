package com.somto;


import java.util.Arrays;

/**
 * Contains the data to analyze:
 * private constants
 * - the dimensions of the box with length, width and maxWeight
 * - a list of orders,
 * each order contains a list of products,
 * each product contains a list of dimensions
 * <p>
 * public constants determine the sequence of the dimensions of a product
 * <p>
 * public getter
 * - get the dimensions of the box
 * - get the count of orders
 * - get the productlist of one order
 *
 * @author Gerit Kaleck (klk)
 */
public class Data {

    /**
     * determines the index of the info in the array of a product
     */
    public static final int LEN = 0;
    public static final int WID = 1;
    public static final int WT = 2;
    public static final int ID = 3;



    /**
     * dimensions of the box length[cm], width[cm], maxWeight[g]
     */
    private static final int[] BOX_DIMENSIONS = {10, 5, 1000};

    /**
     * array of orders, each order contains an array of products,
     * each product consists of length[cm], width[cm], weight[g]
     */

    private static final int[][][] ORDERS = {
            {{1, 1, 25, 1},
                    {2, 3, 150, 2},
                    {10, 1, 250, 3},
                    {3, 5, 375, 4},
                    {3, 2, 150, 5}
            },
            {{2, 2, 40, 0},
                    {2, 2, 40, 1},
                    {8, 1, 80, 2}, //not in P3
                    {2, 5, 100, 3},
                    {6, 2, 100, 4},
                    {2, 1, 200, 5},
                    {1, 2, 200, 6}
            },
            {{2, 1, 500, 0}, //fits in P1, P2 alone
                    {1, 1, 600, 1}, //never fits (too heavy, if 0 is in)
                    {5, 10, 200, 2}, //never fits
                    {10, 5, 500, 3}  //fits in P3, then alone
            }
    };

    public static int[] getBoxDimensions() {
        return BOX_DIMENSIONS;
    }

    public static int getCounterOfOrders() {
        int counter = 0;

        for (int[][] ints : Data.getOrders()) {
            counter = counter + ints.length;
        }
        return counter;
    }

    public static int[][] getOrder(int idx) {
        int[][] order = new int[2][3];
        for (int i = 0; i < ORDERS.length; i++) {
            switch (idx) {
                case 0:
                    order = ORDERS[i];
                    break;
                case 1:
                    order = ORDERS[i];
                    break;
                case 2:
                    order = ORDERS[i];
                    break;
                default:
                    System.err.println("Invalid Index!");
                    order = null;
            }
        }
        return order;
    }

    public static int[][][] getOrders() {
        return ORDERS;
    }

}

