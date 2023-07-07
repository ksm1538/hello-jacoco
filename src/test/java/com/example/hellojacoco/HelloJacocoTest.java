package com.example.hellojacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJacocoTest {

    @Test
    public void humanTest() {
        String word = "human";
        String result = HelloJacoco.translation(word);

        assertEquals("인간", result);
    }

    @Test
    public void dogTest() {
        String word = "dog";
        String result = HelloJacoco.translation(word);

        assertEquals("강아지", result);
    }

    @Test
    public void catTest() {
        String word = "cat";
        String result = HelloJacoco.translation(word);

        assertEquals("고양이", result);
    }

    @Test
    public void etcTest() {
        String word = "etc";
        String result = HelloJacoco.translation(word);

        assertEquals("알수없음", result);
    }
}
