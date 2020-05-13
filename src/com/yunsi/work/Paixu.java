package com.yunsi.work;

public class Paixu {
    public static void main(String[] args) {
        int[] numbers = new int[]{43, 14, 6, 9, 3, 27, 38, 19, 5};
        int i, j;
        for (i = 0; i < numbers.length - 1; i++) {
            for (j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
}

