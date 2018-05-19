package com.rw.linkedlist;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class LinkedListRW<E> implements Iterable<E> {
    private Element<E> collectionHead = null;
    private int size;

    public int size() {
        return this.size;
    }

    public void add(E e) {
        Element<E> element = new Element<>(e);
        if (collectionHead == null) {
            collectionHead = element;
        } else {
            Element<E> temp = collectionHead;
            while (temp.getNext()!=null) {
                temp = temp.getNext();
            }
            temp.setNext(element);
            element.setPrev(temp);
        }
        size++;
    }

    public E get(int n) {
        checkIndex(n);
        int rangeCheck = 0;
        Element<E> temp = collectionHead;
        while (rangeCheck < n) {
            temp = temp.getNext();
            rangeCheck++;
        }
        return temp.getValue();
    }

    public void clear() {
        collectionHead = null;
        size = 0;
    }

    public void remove(int n) {
        checkIndex(n);
        Element<E> temp = collectionHead;

        int rangeCheck = 0;
        while (rangeCheck < n) {
            temp = temp.getNext();
            rangeCheck++;
        }

        if (rangeCheck > 0 && n == (size - 1)) {
            temp.getPrev().setNext(null);
        } else if (n == 0) {
            if (temp.getNext() != null) {
                temp.getNext().setPrev(null);
                collectionHead = temp.getNext();
            } else {
                collectionHead = null;
            }
        } else {
            temp.getPrev().setNext(temp.getNext());
            temp.getNext().setPrev(temp.getPrev());
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int n) {
        if (n >= size || n < 0) {
            throw new IndexOutOfBoundsException("Index: " + n + ", size: " + size);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new CollectionIterator();
    }

    private class CollectionIterator implements Iterator<E> {
        Element<E> cursor = collectionHead;

        @Override
        public boolean hasNext() {
            return cursor != null && cursor.getValue() != null;
        }

        @Override
        public E next() {
            E currentElement = cursor.getValue();
            cursor = cursor.getNext();
            return currentElement;
        }
    }

    @Override
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator((java.util.Collection<E>) this, 0);
    }

    public Stream<E> stream() {
        return StreamSupport.stream(spliterator(), false);
    }
}