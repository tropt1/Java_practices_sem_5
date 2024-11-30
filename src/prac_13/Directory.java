package prac_13;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {
    private String name;
    private List<FileComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void add(FileComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileComponent component : components) {
            component.display();
        }
    }
}
