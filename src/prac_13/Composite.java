package prac_13;

public class Composite {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        Directory rootDirectory = new Directory("Root");
        rootDirectory.add(file1);

        Directory subDirectory1 = new Directory("Dir1");
        subDirectory1.add(file2);

        Directory subDirectory2 = new Directory("Dir2");
        subDirectory2.add(file3);

        rootDirectory.add(subDirectory1);
        rootDirectory.add(subDirectory2);

        rootDirectory.display();
    }
}
