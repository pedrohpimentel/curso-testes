package com.br.automated_tests_course.nomath;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandonlyTest {

    @Test
    void testA(){
        System.out.println("Running test A: ");
    }
    @Test
    void testB(){
        System.out.println("Running test B: ");
    }
    @Test
    void testC(){
        System.out.println("Running test C: ");
    }
}
