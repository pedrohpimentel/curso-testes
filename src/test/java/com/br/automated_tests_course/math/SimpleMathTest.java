package com.br.automated_tests_course.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

// Adicione o nome que você irá atribuir a classe.
@DisplayName("Test Math Operations in SimpleMath Class ")
public class SimpleMathTest {

    SimpleMath math; // Colocamos o método math para fora e instanciamos ele dentro do beforeEach.
                    // Apagando todos os locais na onde instanciamos o "new SimpleMath""
    @BeforeAll
    static void setup(){ // O método @BeforeAll necessita ser static e void.
                        // Aqui você irá definir algo que será executado ANTES de todos os test.
        System.out.println("Running Before All Method");
    }

    @AfterAll
    static void cleanup(){ // O método @AfterAll necessita ser static e void.
        // Você limpará o DB, desfaz tudo o que foi feito nos tests.
        System.out.println("Running After All Method");
    }

    @BeforeEach
    void beforeEachMethod(){ // O método @BeforeEach necessita ser só void.
                            // Utilizado para verificar algo antes do test.
        math = new SimpleMath();
        System.out.println("Running Before Each Method");
    }

    @AfterEach
    void afterEachMethod(){ // O método @AfterEach necessita ser só void.
                            // Utilizado para verificar algo depois do test.
        System.out.println("Running After Each Method");
    }

    //Padrão para seguir -> test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2.0 = 8.2") // Adicione o nome que você irá atribuir ao método.
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo(){

        System.out.println("Test 6.2 + 2.0 = 8.2");

        // AAA Arrange, Act e Assert
        //Given, Arrange -> Variáveis que serão utilizadas no teste.

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;

        //When, Act -> Método que será testado.
        Double actual = math.sum(firstNumber,secondNumber);

        //Then, Assert -> Onde valida o retorno e verifica se o comportamento é o mesmo do esperado método testado.
        assertEquals(expected,actual,
                () -> firstNumber + " + " + secondNumber + " did not produce " + expected + "!");

    }

    @Test
    @DisplayName("Test 8.0 - 6.0 = 2.0")
    void testSubtraction(){
        System.out.println("Test 8.0 = 6.0");

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
        System.out.println("Test 8.0 = 10.0");

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
        System.out.println("Test 100.0 / 10.0");

        double firstNumber = 100D;
        double secondNumber = 10D;
        Double actual = math.division(firstNumber,secondNumber);
        double expected = 10D;

        assertEquals(expected, actual,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
    }

   // @Disabled ("TODO: We need still work on it")
    @Test
    @DisplayName("Test Division By Zero")
    void testDivision_When_FirstNumberDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Test Division By Zero");

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

    @Test
    @DisplayName("Test (10 + 10)/2 = 10")
    void testMean(){
        System.out.println("Test (10 + 10)/2 = 10");
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
        System.out.println("Test Square Root of 144");
        double number = 144D;
        double expected = 12D;
        Double actual = math.squareRoot(number);

        assertEquals(expected, actual,
                () -> "Square Root of " + number + " did not produce " + expected + "!");
    }
}
