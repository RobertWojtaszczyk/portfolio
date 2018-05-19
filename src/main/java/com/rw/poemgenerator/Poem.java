package com.rw.poemgenerator;


import com.rw.linkedlist.LinkedListRW;

public class Poem {
//    private List<String> poem = new ArrayList<>();
    private LinkedListRW<String> poem2 = new LinkedListRW<>();

//    public List<String> generate(int rowCount) {
    public LinkedListRW<String> generate(int rowCount) {
        Sentence sentence;
        for (int i = 0; i < rowCount; i++) {
            sentence = new Sentence();
            poem2.add(sentence.generate());
        }
        return poem2;
//        return poem;
    }

}
