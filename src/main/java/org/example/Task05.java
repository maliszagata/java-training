package org.example;

import java.util.Arrays;
import java.util.List;

// https://adventofcode.com/2020/day/1
public class Task05 {
    static int getResult(String report) {

        List<String> inputIntList = Arrays.asList(report.split("\n"));
        Integer firstNumber;
        Integer secondNumber;

        for (int i = 0; i < inputIntList.size(); i++) {
            for (int j = i; j < inputIntList.size(); j++) {
                firstNumber = Integer.valueOf(inputIntList.get(i));
                secondNumber = Integer.valueOf(inputIntList.get(j));
                if (firstNumber + secondNumber == 2020) {
                    return firstNumber * secondNumber;
                }
            }
        }

        return 0;
    }
}
