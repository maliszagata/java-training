package org.example;

import java.util.Arrays;
import java.util.List;

// https://adventofcode.com/2015/day/2
public class Task02 {
    static int getPaperNeeded(String dimensions) {
        List<String> listOfDimension = Arrays.asList(dimensions.split("x"));

        int dim1 = Integer.parseInt(listOfDimension.get(0));
        int dim2 = Integer.parseInt(listOfDimension.get(1));
        int dim3 = Integer.parseInt(listOfDimension.get(2));

        int side1 = dim1 * dim2;
        int side2 = dim1 * dim3;
        int side3 = dim2 * dim3;

        int minimalArea = Math.min(side1, Math.min(side2, side3));

        return 2 * side1 + 2 * side2 + 2 * side3 + minimalArea;
    }
}
