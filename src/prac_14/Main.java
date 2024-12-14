package prac_14;

public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudent("maxim");
        studentList.addStudent("roman");
        studentList.addStudent("alexander");

        Iterator<String> iterator = studentList.getIterator();

        System.out.println("Список студентов:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
