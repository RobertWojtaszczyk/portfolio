package com.rw.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTestSuite {
    @Test
    public void testAddAndRemoveOneElement() {
        //Given
        LinkedListRW<String> linkedListRW = new LinkedListRW<>();
        linkedListRW.add("first");

        //When
        int size = linkedListRW.size();
        linkedListRW.remove(0);
        //Then
        Assert.assertEquals(1, size);
        Assert.assertEquals(0, linkedListRW.size());
        Assert.assertTrue(linkedListRW.isEmpty());
    }

    @Test
    public void testAddFewElementsRemoveLast() {
        //Given
        LinkedListRW<String> linkedListRW = new LinkedListRW<>();
        linkedListRW.add("first");
        linkedListRW.add("second");
        linkedListRW.add("third");
        linkedListRW.add("fourth");

        //When
        int size = linkedListRW.size();
        linkedListRW.remove(3);
        String third = linkedListRW.get(2);
        //Then
        Assert.assertEquals(4, size);
        Assert.assertEquals(3, linkedListRW.size());
        Assert.assertEquals("third", third);
        Assert.assertFalse(linkedListRW.isEmpty());
    }

    @Test
    public void testAddFewElementsRemoveMiddleOne() {
        //Given
        LinkedListRW<String> linkedListRW = new LinkedListRW<>();
        linkedListRW.add("first");
        linkedListRW.add("second");
        linkedListRW.add("third");
        linkedListRW.add("fourth");

        //When
        linkedListRW.remove(1);
        String second = linkedListRW.get(1);
        int size = linkedListRW.size();
        //Then
        Assert.assertEquals(3, size);
        Assert.assertEquals("third", second);
    }

    @Test
    public void testAddFewElementsRemoveFirst() {
        //Given
        LinkedListRW<String> linkedListRW = new LinkedListRW<>();
        linkedListRW.add("first");
        linkedListRW.add("second");
        linkedListRW.add("third");
        linkedListRW.add("fourth");

        //When
        linkedListRW.remove(0);
        String first = linkedListRW.get(0);
        int size = linkedListRW.size();
        //Then
        Assert.assertEquals(3, size);
        Assert.assertEquals("second", first);
    }

    @Test
    public void testPrintWholeCollection() {
        //Given
        LinkedListRW<String> linkedListRW = new LinkedListRW<>();
        linkedListRW.add("first");
        linkedListRW.add("second");
        linkedListRW.add("third");
        linkedListRW.add("fourth");

        //When
        int count = 0;
        for (String element : linkedListRW) {
//            System.out.println(element);
            count++;
        }
        //Then
        Assert.assertEquals(4, count);
    }

    @Test
    public void testClearCollection() {
        //Given
        LinkedListRW<String> linkedListRW = new LinkedListRW<>();
        linkedListRW.add("first");
        linkedListRW.add("second");
        linkedListRW.add("third");
        linkedListRW.add("fourth");

        //When
        linkedListRW.clear();
        linkedListRW.add("fifth");
        linkedListRW.add("sixth");
        linkedListRW.add("seventh");

        int count = 0;
        for (String element : linkedListRW) {
//            System.out.println(element);
            count++;
        }
        //Then

        Assert.assertEquals(3, count);
        Assert.assertEquals(3, linkedListRW.size());
    }
}