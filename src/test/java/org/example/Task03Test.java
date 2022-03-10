package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task03Test {
    @Test
    void getCaptcha() {
        assertEquals(Task03.getCaptcha("1122"), 3);
        assertEquals(Task03.getCaptcha("1111"), 4);
        assertEquals(Task03.getCaptcha("1234"), 0);
        assertEquals(Task03.getCaptcha("91212129"), 9);
    }

}