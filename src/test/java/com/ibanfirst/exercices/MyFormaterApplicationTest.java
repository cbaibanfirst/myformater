package com.ibanfirst.exercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyFormaterApplicationTest {

    @Test
    void getType() {
        String input = "type=A\ncontent=Lorem ipsum dolor sit amet.";
        Assertions.assertEquals("A", MyFormaterApplication.getType(input));
    }

    @Test
    void getContent() {
        String input = "type=A\ncontent=Lorem ipsum dolor sit amet.";
        Assertions.assertEquals("Lorem ipsum dolor sit amet.", MyFormaterApplication.getContent(input));
    }

    @Test
    void formatAType() {
        String input = "Lorem ipsum, dolor sit amet.";
        Assertions.assertEquals("Loremipsumdolorsitamet", MyFormaterApplication.formatAType(input));
    }

    @Test
    void formatDefaultTypeType() {
        String input = "Lorem ipsum dolor sit amet.";
        Assertions.assertEquals(".tema tis rolod muspi meroL", MyFormaterApplication.formatDefaultType(input));
    }
}