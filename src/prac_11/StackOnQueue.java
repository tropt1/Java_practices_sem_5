package prac_11;

import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
    private Queue<Integer> queue;

    public StackOnQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        for (int i = 1; i < size; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return queue.poll();
    }

    public int top() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Стек: " + stack);

        System.out.println("Вершина стека (top): " + stack.top());

        System.out.println("Удаление вершины стека (pop): " + stack.pop());

        System.out.println("Стек пуст: " + stack.empty());

        System.out.println("Элементы в стеке: " + stack);
    }
}
