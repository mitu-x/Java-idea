package com.mitu.generics;

public interface Data<E> {
    void add(E e);
    void remove(int i);
    void update(E e);
    E query(int i);
}
