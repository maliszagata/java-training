package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://adventofcode.com/2017/day/1
public class Task03 {
    static int getCaptcha(String digits) {

        List<Integer> integerList = stringToIntegerList(digits);
        int sum = 0;
        int digitsSize = integerList.size();
        for (int i = 0; i < digitsSize; i++) {
            if (compare(integerList,i)) {
                sum = sum + integerList.get(i % digitsSize);
            }
        }

        return sum;
    }

    private static boolean compare(List<Integer> integerList, int i) {
        return integerList.get(i % integerList.size()).equals(integerList.get((i + 1) % integerList.size()));

    }


    private static List<Integer> stringToIntegerList(String digits) {

        List<Integer> integerList = new ArrayList<>();
        List<String> digitsList = Arrays.asList(digits.split(""));
        for (String s : digitsList) {
            integerList.add(Integer.valueOf(s));
        }

        return integerList;
    }
}
