package com.rw.poemgenerator;


import com.rw.linkedlist.Collection;

public class Poem {
//    private List<String> poem = new ArrayList<>();
    private Collection<String> poem2 = new Collection<>();

//    public List<String> generate(int rowCount) {
    public Collection<String> generate(int rowCount) {
        Sentence sentence;
        for (int i = 0; i < rowCount; i++) {
            sentence = new Sentence();
            poem2.add(sentence.generate());
        }
        return poem2;
//        return poem;
    }

}
