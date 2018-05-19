package com.rw.poemgenerator;

import com.rw.linkedlist.LinkedListRW;

public class PoemRunner {
    public static void main (String[] args) {
        Poem poem = new Poem();
//        List<String> poem1;

        LinkedListRW<String> poem1;
        poem1 = poem.generate(50);

        for (String sentence : poem1) {
            System.out.println(sentence);
        }

//        poem1.stream().forEach(System.out::println);
    }
}
