package com.br.automated_tests_course.math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
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

    @ParameterizedTest
    @DisplayName("Test 6.2 / 2 = 3.1")
    // @MethodSource("testDivisionInputParameters")
    @MethodSource
    void testDivision(double firstNumber,  double secondNumber, double expected){

        System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected);
        Double actual = math.division(firstNumber,secondNumber);

        assertEquals(expected, actual, 2D,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
    }

    // public static Stream<Arguments> testDivisionInputParameters()
    public static Stream<Arguments> testDivision(){
        return Stream.of(
                Arguments.of(6.2D,2D,3.1D),
                Arguments.of(71D,14D,5.07d),
                Arguments.of(18.3,3.1D,5.9D)
        );
    }

}
