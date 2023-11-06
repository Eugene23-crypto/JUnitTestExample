package com.in28minutes.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {

    List<String> list = Arrays.asList("AWS", "AZURE","DevOps");

    @BeforeAll
    static void beforeTest(){
        System.out.println("Before All");
    }

    @Test
    void myAssert() {
        //assertNull(list);
        //assertNotNull(list);
        System.out.println("The Test");
        assertTrue(list.contains("AWS"));
        //assertArrayEquals(new int[]{1,2},new int[]{1,2});
    }

    @AfterAll
    static void afterTest(){
        System.out.println("After All");
    }
}