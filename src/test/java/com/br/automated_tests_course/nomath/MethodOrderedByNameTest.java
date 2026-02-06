package com.br.automated_tests_course.nomath;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
@TestMethodOrder(MethodOrderer.MethodName.class) // Irá executar de na ordem de acordo com o nome.
public class MethodOrderedByNameTest {

    @Test
    void testB(){
        System.out.println("Running test B: ");
    }
    @Test
    void testC(){
        System.out.println("Running test C: ");
    }
    @Test
    void testA(){
        System.out.println("Running test A: ");
    }

}
