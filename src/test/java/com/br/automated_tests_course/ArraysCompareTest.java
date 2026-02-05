package com.br.automated_tests_course;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysCompareTest {

    @Test
    void test(){
        int[] numbers = {25,8,21,32,3};
        int[] expectedArray = {3,8,21,25,32};

        Arrays.sort(numbers);

        // para comparar um array com o outros utilize : assertArrayEquals().
        assertArrayEquals(numbers, expectedArray);

    }
}
