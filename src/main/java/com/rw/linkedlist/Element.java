package com.rw.linkedlist;

public class Element<E> {
    private E value;
    private Element<E> next = null;
    private Element<E> prev = null;

    public Element (E value) {
        this.value = value;
    }

    public E getValue() {
        return this.value;
    }

    public Element<E> getNext() {
        return this.next;
    }

    public Element<E> getPrev() {
        return this.prev;
    }

    public void setNext(Element<E> next) {
        this.next = next;
    }

    public void setPrev(Element<E> prev) {
        this.prev = prev;
    }
}