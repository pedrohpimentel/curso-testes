package com.br.automated_tests_course.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DemoRepeatedTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod(){ // O método @BeforeEach necessita ser só void.
        // Utilizado para verificar algo antes do test.
        math = new SimpleMath();
        System.out.println("Running Before Each Method");
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition"
            + "{currentRepetition} of {totalRepetitions}!")// Muda o nome do teste que for repetido no log.
    @DisplayName("Test Division By Zero")
    void testDivision_When_FirstNumberDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo, // Mostra as informações que de quantas vezes o test foi rodado.
            TestInfo testInfo // Pega o nome da classe e jogar para o log.
    ) {
        System.out.println("Repetition info " + repetitionInfo.getCurrentRepetition() +
                " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());

        //Given
        double firstNumber = 6.2D;
        double secondNumber = 0D;

        var expectedMessage = "Impossível dividir por 0!";

        //When & Then
        ArithmeticException actual = assertThrows(ArithmeticException.class,
                //When & Then
                () -> math.division(firstNumber, secondNumber), () -> "Division by zero should throw an ArithmeticException!");
        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
    }

}
