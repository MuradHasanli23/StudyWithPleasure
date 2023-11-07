package com.happiness.StudyWithPleasure.Models;

import java.util.Random;

public enum Operations {
    SUM, SUBTRACTION, MULTIPLICATION, DIVISION;

    private static final Random random = new Random();
    private static final Operations[] operations = values();

    public static Operations randomOperation() {
        return operations[random.nextInt(operations.length)];
    }
}
