package com.br.automated_tests_course.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Adicione o nome que você irá atribuir a classe.
@DisplayName("Test Math Operations in SimpleMath Class ")
public class SimpleMathTest {

    //Padrão para seguir -> test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2.0 = 8.2") // Adicione o nome que você irá atribuir ao método.
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo(){
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
    }

    @Test
    @DisplayName("Test 8.0 - 6.0 = 2.0")
    void testSubtraction(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 8D;
        double secondNumber = 6D;
        Double actual = math.subtraction(firstNumber,secondNumber);
        double expected = 2D;

        assertEquals(expected, actual,
                () -> firstNumber + " - " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test 8.0 * 10.0 = 80.0")
    void testMultiplication(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 8D;
        double secondNumber = 10D;
        Double actual = math.multiplication(firstNumber,secondNumber);
        double expected = 80D;

        assertEquals(expected, actual,
                () -> firstNumber + " * " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test 100.0 / 10.0 = 10.0")
    void testDivision(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 100D;
        double secondNumber = 10D;
        Double actual = math.division(firstNumber,secondNumber);
        double expected = 10D;

        assertEquals(expected, actual,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
    }

    //Padrão para seguir -> test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test Division By Zero")
    void testDivision_When_FirstNumberDividedByZero_ShouldThrowArithmeticException(){
        SimpleMath math = new SimpleMath();
        fail();
    }

    @Test
    @DisplayName("Test (10 + 10)/2 = 10")
    void testMean(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 10D;
        double secondNumber = 10D;
        Double actual = math.mean(firstNumber,secondNumber);
        double expected = 10D;

        assertEquals(expected, actual,
                () -> "("+firstNumber + " + " + secondNumber +")/2"+ " did not produce " + expected + "!");
    }

    @Test
    @DisplayName("Test Square Root of 144 = 12")
    void testSqrt(){
        SimpleMath math = new SimpleMath();
        double number = 144D;
        double expected = 12D;
        Double actual = math.squareRoot(number);

        assertEquals(expected, actual,
                () -> "Square Root of " + number + " did not produce " + expected + "!");
    }
}
