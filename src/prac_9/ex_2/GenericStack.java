package prac_9.ex_2;

public class GenericStack<E> {
    private E[] array;
    private int size;

    public GenericStack() {
        array = (E[]) new Object[1];
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[size - 1];
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        E item = array[size - 1];
        size--;
        return item;
    }

    public void push(E item) {
        if (size == array.length) {
            resize(2 * array.length);
        }
        array[size++] = item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity];
        if (size >= 0) System.arraycopy(array, 0, temp, 0, size);
        array = temp;
    }
}