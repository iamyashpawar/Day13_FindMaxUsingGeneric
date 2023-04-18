package com.birdgelabz;

import java.util.Scanner;

public class MaxVar
{




    public Integer findMaxInt(Integer num1, Integer num2, Integer num3) {

        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        System.out.println(max);
        return max;

    }



    public Float findMaxFloat(Float num1, Float num2, Float num3) {

        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        System.out.println(max);
        return max;

    }

    public String findMaxString(String s1, String s2, String s3) {

        String max = s1;
        if (s2.compareTo(max) > 0) {
            max = s2;
        }
        if (s3.compareTo(max) > 0) {
            max = s3;
        }
        System.out.println(max);
        return max;

    }



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
