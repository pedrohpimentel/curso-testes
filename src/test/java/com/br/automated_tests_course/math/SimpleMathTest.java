package com.br.automated_tests_course.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

    @Test
    void testSum(){
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(6.2D,2D);
        double expected = 8.2D;

        assertEquals(expected,actual,"6.2 + 2 did not produce 8.2!");
        assertNotEquals(9.2, actual); //Garante que o valor atual não seja igual 9.2
        assertNotNull(actual); // Se o valor "actual" (Objeto) for nulo, a asserção falha e o teste é interrompido com erro

    }
}
