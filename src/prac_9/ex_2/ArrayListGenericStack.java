package prac_9.ex_2;

import java.util.ArrayList;

public class ArrayListGenericStack<E> extends ArrayList<E> {
    public ArrayListGenericStack() {
        super();
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return get(size() - 1);
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return remove(size() - 1);
    }

    public void push(E item) {
        add(item);
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
