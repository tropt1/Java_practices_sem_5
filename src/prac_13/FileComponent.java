package prac_13;

public interface FileComponent {
    void display();
    default void add(FileComponent component) {
        throw new UnsupportedOperationException("Балбес");
    }
}
