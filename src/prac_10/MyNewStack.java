package prac_10;

import java.util.ArrayList;

public class MyNewStack extends ArrayList<Object> {
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return super.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return super.remove(getSize() - 1);
    }

    public void push(Object o) {
        super.add(o);
    }
}
