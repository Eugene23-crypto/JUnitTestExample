package com.in28minutes.junit;

import java.util.ArrayList;
import java.util.List;

public class MyMath {
    public int calculateSum(int[] elements){
        int sum = 0;

        for (int element: elements) {
            sum += element;
        }

        return sum;
    }
}
