package com.pubmatic.uniquecharacter.src;

public class UniqueCharacter {


    public Character findUniqueCharacterInString(String inputString) {

        for (int index = 0; index < inputString.length(); index++) {
            char character = inputString.charAt(index);
            int firstIndex = inputString.indexOf(character);
            int lastIndex = inputString.lastIndexOf(character);
            if (firstIndex == lastIndex) {
                return character;
            }
        }
        return '\0';
    }
}
