package com.br.automated_tests_course.nomath;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(3)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Irá ordenar por índice
public class MethodOrderedByOrder {

    @Test
    @Order(1) // Setamos a ordem pelo @Order
    void testB(){
        System.out.println("Running test B: ");
    }

    @Test
    @Order(2)
    void testC(){
        System.out.println("Running test C: ");
    }

    @Test
    @Order(3)
    void testA(){
        System.out.println("Running test A: ");
    }

}
