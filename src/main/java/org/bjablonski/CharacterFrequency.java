package org.bjablonski;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CharacterFrequency {

    public Map<Character, Long> countCharacterFrequency(String stringToBeCounted) {
        HashMap<Character, Long> characterFrequency = new HashMap<Character, Long>();
        stringToBeCounted = stringToBeCounted.toLowerCase();

        for(char characterToCheck : stringToBeCounted.toCharArray()) {
            if(Character.isLetter(characterToCheck)){
                Long frequency = Optional.ofNullable(
                        characterFrequency.get(characterToCheck))
                        .orElse(0L);

                    characterFrequency.put(characterToCheck, frequency + 1);
            }
        }
        return characterFrequency;
    }
}
