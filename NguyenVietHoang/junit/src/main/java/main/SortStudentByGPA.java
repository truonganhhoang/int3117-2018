package main;

import java.util.Comparator;

public class SortStudentByGPA implements Comparator<Student> {

    public int compare(Student student1, Student student2) {
        if (student1.getGpa() > student2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
