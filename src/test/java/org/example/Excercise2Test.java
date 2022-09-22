package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Excercise2Test {

    @Test
    @DisplayName("6,11,2")
    void twoElevenTwo(){
        Excercise2 excercise2 = new Excercise2();
        assertEquals(3, excercise2.solution2(6,11,2));
    }

    @Test
    @DisplayName("1,11,3")
    void oneElevenThree(){
        Excercise2 excercise2 = new Excercise2();
        assertEquals(3, excercise2.solution2(1,11,3));
    }

    @Test
    @DisplayName("1,10,1")
    void oneTenOne(){
        Excercise2 excercise2 = new Excercise2();
        assertEquals(10, excercise2.solution2(1,10,1));
    }

    @Test
    @DisplayName("0,10,1")
    void zeroTenOne(){
        Excercise2 excercise2 = new Excercise2();
        assertEquals(11, excercise2.solution2(0,10,1));
    }

    @Test
    @DisplayName("11,78,11")
    void elevenSeventyEightEleven(){
        Excercise2 excercise2 = new Excercise2();
        assertEquals(7, excercise2.solution2(11,78,11));
    }
}