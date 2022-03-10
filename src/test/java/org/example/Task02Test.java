package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task02Test {
    @Test
    public void getPaperNeeded() {
        assertEquals(Task02.getPaperNeeded("2x3x4"), 58);
        assertEquals(Task02.getPaperNeeded("1x1x10"), 43);
    }
}