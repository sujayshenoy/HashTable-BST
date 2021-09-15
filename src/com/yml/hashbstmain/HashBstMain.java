package com.yml.hashbstmain;

import com.yml.hashmap.HashMap;

public class HashBstMain {
    public static void main(String args[]) {
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        
        String sentence = "to be or not to be";

        String words[] = sentence.split(" ");

        for (String word : words) {
            if (wordCount.get(word) == null) {
                wordCount.add(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.add(word, count+1);
            }
        }
        

        wordCount.print();
    }
}
