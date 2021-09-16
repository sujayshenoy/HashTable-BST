package com.yml.hashbstmain;

import com.yml.hashmap.HashMap;
import com.yml.hashmap.LinkedHashMap;

public class HashBstMain {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<String, Integer>();
        
        String sentence = 
        "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String words[] = sentence.split(" ");

        for (String word : words) {
            if (wordCount.get(word) == null) {
                wordCount.add(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.add(word, count+1);
            }
        }
        

        wordCount.printLinkedHashMap();
    }
}
