package prac_14;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<String> students = new ArrayList<>();

    public void addStudent(String student) {
        students.add(student);
    }

    public StudentIterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < students.size();
        }

        @Override
        public String next() {
            if (hasNext()) {
                return students.get(index++);
            }
            return null;
        }
    }
}
