package com.br.automated_tests_course.math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


// Adicione o nome que você irá atribuir a classe.
@DisplayName("Test Math Operations in SimpleMath Class ")
public class SimpleMathTestS4 {

    SimpleMath math; // Colocamos o método math para fora e instanciamos ele dentro do beforeEach.
                    // Apagando todos os locais na onde instanciamos o "new SimpleMath""

    @BeforeEach
    void beforeEachMethod(){ // O método @BeforeEach necessita ser só void.
                            // Utilizado para verificar algo antes do test.
        math = new SimpleMath();

    }

    @DisplayName("Test Double Division [firstNumber, secondNumber, expected]")
    @ParameterizedTest
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivision(double firstNumber,  double secondNumber, double expected){

        System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected);
        Double actual = math.division(firstNumber,secondNumber);

        assertEquals(expected, actual, 2D,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
    }


}
