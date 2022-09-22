package org.example;

import jdk.jshell.spi.ExecutionControlProvider;

public class Main {
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        System.out.println(exercise1.solution1(222));
        Excercise2 excercise2 = new Excercise2();
        System.out.println(excercise2.solution2(6,11,2));

    }
}