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

}
