package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int r = rand.nextInt(100);
            array.add(r);
        }

        for (int i = 0; i < 50; i++) {
            int r1 = rand.nextInt(100);
            array2.add(r1);
        }

        if (array == array2) {
            System.out.println("pole se shodují");
        } else {
            System.out.println("pole se neshodují");

            for (int i = 99; i > 49; i--) {
                array.remove(i);
            }

            for (int i = 0; i < 50; i++) {
                if (array.get(i) != array2.get(i)) {
                    array2.set(i, array.get(i));
                }
            }
        }
        System.out.println(array + " " + array2);
    }
}
