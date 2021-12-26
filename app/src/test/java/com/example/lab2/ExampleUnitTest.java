package com.example.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.lab2.utils.TextCounter;

public class ExampleUnitTest {
    @Test
    public void Test01GetCharsCount() {
        String test = "test";

        int expectedValue = 4;
        int actualValue = TextCounter.getCharsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test02GetCharsCount() {
        String test = "";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test03GetCharsCount() {
        String test = " ";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test04GetCharsCount() {
        String test = null;

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test05GetCharsCount() {
        String test = "The Battle of Panormus was fought in Sicily in 250 BC during the First Punic War between a Roman army led by Lucius Caecilius Metellus and a Carthaginian force led by Hasdrubal. The Roman force of two legions defending the city of Panormus defeated the much larger Carthaginian army of 30,000 men and between 60 and 142 war elephants.\n" +
                "The war had commenced in 264 BC with Carthage in control of much of Sicily, where most of the fighting took place. In 256–255 BC the Romans attempted to strike at the city of Carthage in North Africa, but suffered a heavy defeat by a Carthaginian army strong in cavalry and elephants. When the focus of the war returned to Sicily, the Romans captured the large and important city of.\n";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test01GetWordsCount() {
        String test = "test";

        int expectedValue = 1;
        int actualValue = TextCounter.getWordsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test02GetWordsCount() {
        String test = "";

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test03GetWordsCount() {
        String test = " ";

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test04GetWordsCount() {
        String test = null;

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test05GetWordsCount() {
        String test = "       ";

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(test);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test06GetWordsCount() {
        String test = "The Battle of Panormus was fought in Sicily in 250 BC during the First Punic War between a Roman army led by Lucius Caecilius Metellus and a Carthaginian force led by Hasdrubal. The Roman force of two legions defending the city of Panormus defeated the much larger Carthaginian army of 30,000 men and between 60 and 142 war elephants.\n" +
                "The war had commenced in 264 BC with Carthage in control of much of Sicily, where most of the fighting took place. In 256–255 BC the Romans attempted to strike at the city of Carthage in North Africa, but suffered a heavy defeat by a Carthaginian army strong in cavalry and elephants. When the focus of the war returned to Sicily, the Romans captured the large and important city of.\n";

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(test);

        assertEquals(expectedValue, actualValue);
    }

}