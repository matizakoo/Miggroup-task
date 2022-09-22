package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {
    @Test
    @DisplayName("0")
    void zero(){
        Exercise1 excercise1 = new Exercise1();
        assertEquals(0, excercise1.solution1(0));
    }

    @Test
    @DisplayName("-222")
    void minus222(){
        Exercise1 excercise1 = new Exercise1();
        assertEquals(1, excercise1.solution1(-222));
    }

    @Test
    @DisplayName("4333")
    void plus4333(){
        Exercise1 excercise1 = new Exercise1();
        assertEquals(2, excercise1.solution1(4333));
    }

    @Test
    @DisplayName("2110")
    void plus2110(){
        Exercise1 excercise1 = new Exercise1();
        assertEquals(3, excercise1.solution1(2110));
    }

    @Test
    @DisplayName("-111324")
    void minus111324(){
        Exercise1 excercise1 = new Exercise1();
        assertEquals(4, excercise1.solution1(-111324));
    }
}