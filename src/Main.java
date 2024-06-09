// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = initializeStudents();

        if (students == null || students.isEmpty()) {
            System.out.println("The student list is empty or not initialized.");
            return;
        }

        // Print original list
        System.out.println("Original List:");
        printStudents(students);

        // Sort and print by name
        ArrayList<Student> studentsByName = new ArrayList<>(students);
        SelectionSort.selectionSort(studentsByName, new NameComparator());
        System.out.println("\nSorted by Name:");
        printStudents(studentsByName);

        // Sort and print by roll number
        ArrayList<Student> studentsByRollNo = new ArrayList<>(students);
        SelectionSort.selectionSort(studentsByRollNo, new RollNoComparator());
        System.out.println("\nSorted by Roll Number:");
        printStudents(studentsByRollNo);
    }

    private static ArrayList<Student> initializeStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(10, "Alice", "123 Main St"));
        students.add(new Student(2, "Bob", "456 Elm St"));
        students.add(new Student(5, "Charlie", "789 Oak St"));
        students.add(new Student(8, "David", "101 Pine St"));
        students.add(new Student(1, "Eve", "202 Maple St"));
        students.add(new Student(9, "Frank", "303 Cedar St"));
        students.add(new Student(6, "Grace", "404 Birch St"));
        students.add(new Student(7, "Hank", "505 Walnut St"));
        students.add(new Student(4, "Ivy", "606 Cherry St"));
        students.add(new Student(3, "Jack", "707 Willow St"));
        return students;
    }

    private static void printStudents(ArrayList<Student> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
