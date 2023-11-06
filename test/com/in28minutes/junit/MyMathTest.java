package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyMathTest {

    @Test
    void calculateSum_ThreeMembers(){
        assertEquals(0, new MyMath().calculateSum(new int[]{}));
    }

    @Test
    void calculateSum_ZeroMember(){
        assertEquals(6, new MyMath().calculateSum(new int[]{1,2,3}));
    }

}