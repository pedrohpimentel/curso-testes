package com.br.automated_tests_course.nomath;

import org.junit.jupiter.api.*;

//@Order(3)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Irá ordenar por índice
public class MethodOrderedByOrderIndexTest {

    StringBuilder actualValue = new StringBuilder("");

    @AfterEach
    void afterEach() {
        System.out.println("The actual value is " + actualValue);
    }

    @Test
    @Order(1) // Setamos a ordem pelo @Order
    void testB(){
        System.out.println("Running test B: ");
        actualValue.append("3");
    }

    @Test
    @Order(2)
    void testC(){
        System.out.println("Running test C: ");
        actualValue.append("1");
    }

    @Test
    @Order(3)
    void testA(){
        System.out.println("Running test A: ");
        actualValue.append("2");
    }


}
