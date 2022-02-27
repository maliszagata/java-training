package org.example;
// https://adventofcode.com/2015/day/1
public class Task01 {
    static int getCurrentFloor(String instructions) {
        int floor = 0;

        for (int i = 0; i < instructions.length(); i++) {
            if ("(".equals(String.valueOf(instructions.charAt(i)))) {
                floor++;
            } else if (")".equals(String.valueOf(instructions.charAt(i)))) {
                floor--;
            }
        }

        return floor;
    }
}
