package ru.geekbrains.Lesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        int[] invertedArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(invertedArr));
        invertArray(invertedArr);
        System.out.println(Arrays.toString(invertedArr));

        int[] eightArr = fillArrayWithStep(10, 5);

        System.out.println("Number 2:");
        System.out.println(Arrays.toString(eightArr));

        int[] sixArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Number 3:");
        System.out.println(Arrays.toString(sixArr));
        workWithSix(sixArr);
        System.out.println(Arrays.toString(sixArr));


        int[][] diagonalArr = diagonalArr(9, 9);
        System.out.println("Number 4:");
        printArr(diagonalArr);

        int[] minMaxArr = {1, 5, 3, 2, 11, 4, 50, 5, 2, -10, 4, 8, 9, 1};
        int min = findMin(minMaxArr);
        int max = findMax(minMaxArr);

        System.out.println(findMax(1, 2, 4, 23, 15, 68, 256));


        System.out.printf("Min = %d \r\nMax = %d\r\n", min, max);

        int[] someArr = {2, 3, 4, 1, 8, 14, 5, 10, 13, 4};

        System.out.println(checkBalance(someArr));

        System.out.println(Arrays.toString(someArr));

        shift(someArr, 2);

        System.out.println(Arrays.toString(someArr));


    }

    private static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    private static int findMin(int... arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) min = i;
        }
        return min;
    }

    private static int findMax(int... arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) max = i;
        }
        return max;
    }


    private static int[][] diagonalArr(int size, int value) {
        int[][] diagonalArr = new int[size][size];
        for (int i = 0; i < size; i++) {
            diagonalArr[i][i] = value;
            diagonalArr[i][diagonalArr.length - i - 1] = value;
        }
        return diagonalArr;
    }

    private static void workWithSix(int[] sixArr) {
        for (int i = 0; i < sixArr.length; i++) {
            sixArr[i] = sixArr[i] < 6 ? sixArr[i] * 2 : sixArr[i];
        }
    }

    private static int[] fillArrayWithStep(int size, int step) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step;
        }
        return arr;
    }

    private static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }


    static void shift(int[] arr, int n) {
        int shift = (arr.length + n % arr.length) % arr.length;

        for (int i = 0; i < shift; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }


    static boolean checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) return false;

        sum /= 2;
        int left = 0;

        for (int i : arr) {
            left += i;
            if (left == sum) return true;
        }
        return false;
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
