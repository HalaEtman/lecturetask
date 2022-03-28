package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int num[] = new int[10];

        int k = 0;
        for (int i = num.length; i >= 1; i--) {
            num[k] = i;
            k++;
        }

        System.out.println("Before: ");
        System.out.print(Arrays.toString(num));

        int change=0;
        int counter = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                change=num[i + 1];
                num[i + 1] = num[i];
                num[i] = change;
                counter++;
            }
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    change=num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = change;
                    counter++;
                }
                counter++;
            }
            counter++;
        }
        System.out.println("\nAfter: ");
        System.out.print(Arrays.toString(num));
    }
}

