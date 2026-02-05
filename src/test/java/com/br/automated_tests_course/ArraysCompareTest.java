package com.br.automated_tests_course;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysCompareTest {

    @Test
    // @Timeout(1) -> 1 SEGUNDO PARA EXECUTAR, SE NAO EXECUTAR ESTOURA UM ERRO.
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS) //15 MILISSEGUNDOS PARA EXECUTAR, SE NAO EXECUTAR ESTOURA UM ERRO.
    void testSortPerformance(){
        int[] numbers = {25,8,21,32,3};
        for (int i = 0; i < 1000000000  ; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }

    }
}
