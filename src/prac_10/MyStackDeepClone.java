package prac_10;

import java.util.ArrayList;

public class MyStackDeepClone {
    private final ArrayList<Object> list;

    public MyStackDeepClone() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return deepCopy(list.remove(getSize() - 1));
    }

    public void push(Object o) {
        list.add(deepCopy(o));
    }

    private Object deepCopy(Object o) {
        if (o instanceof String) {
            // Строки являются неизменяемыми, поэтому возвращаем сам объект
            return o;
        } else if (o instanceof Cloneable) {
            try {
                return o.getClass().getMethod("clone").invoke(o);
            } catch (Exception e) {
                throw new RuntimeException("Clone failed", e);
            }
        } else {
            throw new RuntimeException("Object must implement Cloneable");
        }
    }
}
