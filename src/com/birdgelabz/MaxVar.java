package com.birdgelabz;

import java.util.Scanner;

public class MaxVar
{

    


    public <T extends Comparable<T>> T findMax(T var1, T var2, T var3) {

        T max = var1;
        if (var2.compareTo(max) > 0) {
            max = var2;
        }
        if (var3.compareTo(max) > 0) {
            max = var3;
        }

        System.out.println(max);

        return max;
    }


}
