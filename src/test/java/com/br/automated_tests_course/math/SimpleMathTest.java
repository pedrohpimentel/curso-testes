package com.br.automated_tests_course.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

    @Test
    void testSum(){
        SimpleMath math = new SimpleMath();
        //Adicionando os números em variáveis para parametrizar a msg.
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber,secondNumber);
        double expected = 8.2D;

        /*
        * Adicionarei uma lambda function para que o comando só seja executado quando realmente houver erro.
        * Buscando otimizar a performance do código.*/
        assertEquals(expected,actual,
                () -> firstNumber + " + " + secondNumber + " did not produce " + expected + "!");
        assertNotEquals(9.2, actual);
        assertNotNull(actual);

    }
}
