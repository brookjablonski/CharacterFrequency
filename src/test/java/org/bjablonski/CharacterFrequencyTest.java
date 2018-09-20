package org.bjablonski;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class CharacterFrequencyTest {

    private CharacterFrequency characterFrequency;

    @Before
    public void setUp(){
        characterFrequency = new CharacterFrequency();
    }

    @Test
    public void testSimpleString(){
        String simpleString = "aabbcc";
        HashMap<Character, Long> expectedOutput = new HashMap<Character, Long>();

        expectedOutput.put('a', 2L);
        expectedOutput.put('b', 2L);
        expectedOutput.put('c', 2L);

        assertEquals( expectedOutput, characterFrequency.countCharacterFrequency(simpleString));
    }

    @Test
    public void testWithUppercaseLetters(){
        String simpleString = "aAabBBbccCc";
        HashMap<Character, Long> expectedOutput = new HashMap<Character, Long>();

        expectedOutput.put('a', 3L);
        expectedOutput.put('b', 4L);
        expectedOutput.put('c', 4L);

        assertEquals( expectedOutput, characterFrequency.countCharacterFrequency(simpleString));
    }

    @Test
    public void testWithNumbers(){
        String simpleString = "aAa1bB2Bbc3cC4c";
        HashMap<Character, Long> expectedOutput = new HashMap<Character, Long>();

        expectedOutput.put('a', 3L);
        expectedOutput.put('b', 4L);
        expectedOutput.put('c', 4L);

        assertEquals( expectedOutput, characterFrequency.countCharacterFrequency(simpleString));
    }

    @Test
    public void testWithSpecialCharacters(){
        String simpleString = "aAa!b@BB$bccCc";
        HashMap<Character, Long> expectedOutput = new HashMap<Character, Long>();

        expectedOutput.put('a', 3L);
        expectedOutput.put('b', 4L);
        expectedOutput.put('c', 4L);

        assertEquals( expectedOutput, characterFrequency.countCharacterFrequency(simpleString));
    }

    @Test
    public void testWithAlternatingCharacters(){
        String simpleString = "ababac";
        HashMap<Character, Long> expectedOutput = new HashMap<Character, Long>();

        expectedOutput.put('a', 3L);
        expectedOutput.put('b', 2L);
        expectedOutput.put('c', 1L);

        assertEquals( expectedOutput, characterFrequency.countCharacterFrequency(simpleString));
    }

    @Test
    public void testNoNine() {
        String simpleString = "9";
        HashMap<Character, Long> expectedOutput = new HashMap<Character, Long>();

        assertEquals(expectedOutput, characterFrequency.countCharacterFrequency(simpleString));
    }

    @Test
    public void testEmptyString() {
        String simpleString = "";
        HashMap<Character, Long> expectedOutput = new HashMap<Character, Long>();

        assertEquals(expectedOutput, characterFrequency.countCharacterFrequency(simpleString));
    }
}
