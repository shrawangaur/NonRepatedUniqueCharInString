package com.pubmatic.uniquecharacter.test;

import com.pubmatic.uniquecharacter.src.UniqueCharacter;
import org.junit.Assert;
import org.junit.Test;

public class UniqueCharacterTest {

    @Test
    public void should_find_whether_unique_character_is_present_or_not() {
        //Given
        String inputString = "ssttrriinngg";
        //When
        UniqueCharacter uniqueChar = new UniqueCharacter();
        char uniqueCharacter = uniqueChar.findUniqueCharacterInString(inputString);
        //Then
        Assert.assertEquals('\0', uniqueCharacter);
    }

    @Test
    public void should_find_first_unique_character_in_small_letter() {
        //Given
        String inputString = "pubmatpicstring";
        //When
        UniqueCharacter uniqueChar = new UniqueCharacter();
        char uniqueCharacter = uniqueChar.findUniqueCharacterInString(inputString);
        //Then
        Assert.assertEquals('u', uniqueCharacter);
    }


    @Test
    public void should_find_first_unique_character_in_caps_letter() {
        //Given
        String inputString = "Java";
        //When
        UniqueCharacter uniqueChar = new UniqueCharacter();
        char uniqueCharacter = uniqueChar.findUniqueCharacterInString(inputString);
        //Then
        Assert.assertEquals('J', uniqueCharacter);
    }
}

