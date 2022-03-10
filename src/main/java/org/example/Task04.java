package org.example;

import java.util.Arrays;
import java.util.List;

// https://adventofcode.com/2018/day/1
public class Task04 {
    static int getFrequency(String changes) {

        List<String> frequencyList = Arrays.asList(changes.split(", "));
        int result = 0;
        for (String s : frequencyList) {
            result = result + Integer.parseInt(s);
        }

        return result;
    }
}
