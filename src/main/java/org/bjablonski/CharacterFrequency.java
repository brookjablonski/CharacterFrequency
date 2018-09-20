package org.bjablonski;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public Map<Character, Long> countCharacterFrequency(String stringToBeCounted) {
        HashMap<Character, Long> characterFrequency = new HashMap<Character, Long>();
        stringToBeCounted = stringToBeCounted.toLowerCase();
        for(char characterToCheck : stringToBeCounted.toCharArray()) {
            if(Character.isLetter(characterToCheck)){
                Long frequency = characterFrequency.get(characterToCheck);
                if(frequency == null){
                    characterFrequency.put(characterToCheck, 1L);
                } else {
                    characterFrequency.put(characterToCheck, new Long(frequency + 1));
                }
            }
        }
        return characterFrequency;
    }
}
