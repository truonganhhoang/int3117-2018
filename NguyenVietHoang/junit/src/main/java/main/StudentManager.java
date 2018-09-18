package main;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private StudentDao studentDao;

    public StudentManager() {
        studentDao = new StudentDao();
        studentList = studentDao.read();
    }

    /**
     * add student to studentList
     */
    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        double gpa = inputGpa();
        Student student = new Student(id, name, age, address, gpa);
        studentList.add(student);
        studentDao.write(studentList);
    }

    /**
     * edit student by id
     * 
     * @param id
     */
    public void edit(int id) {
        int index = findStudentIndexById(id);
        if (index >= 0) {
            studentList.get(index).setName(inputName());
            studentList.get(index).setAge(inputAge());
            studentList.get(index).setAddress(inputAddress());
            studentList.get(index).setGpa(inputGpa());

            studentDao.write(studentList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    /**
     * delete student by id
     * 
     * @param id: student id
     */
    public void delete(int id) {
        int index = findStudentIndexById(id);
        if (index >= 0) {
            studentList.remove(index);
            studentDao.write(studentList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    /**
     * find student index in list by id
     *
     * @param id: student id
     */
    public int findStudentIndexById(Integer id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * find max GPA
     */
    public double getMaxGpa() {
        double gpa = 0;
        for (Student student: studentList) {
            if (student.getGpa() > gpa) {
                gpa = student.getGpa();
            }
        }
        return round(gpa, 1);
    }

    /**
     * find min GPA
     */
    public double getMinGpa() {
        double gpa = 10;
        for (Student student: studentList) {
            if (student.getGpa() < gpa) {
                gpa = student.getGpa();
            }
        }
        return round(gpa, 1);
    }

    private static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

    /**
     * sort student by name
     */
    public void sortStudentByName() {
        Collections.sort(studentList, new SortStudentByName());
    }

    /**
     * sort student by id
     */
    public void sortStudentByGPA() {
        Collections.sort(studentList, new SortStudentByGPA());
    }

    /**
     * show list student to screen
     */
    public void show() {
        for (Student student : studentList) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f%n", student.getGpa());
        }
    }

    /**
     * input student id
     * 
     * @return student id
     */
    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
    
    /**
     * input student name
     * 
     * @return student name
     */
    private String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }

    /**
     * input student address
     * 
     * @return student address
     */
    private String inputAddress() {
        System.out.print("Input student address: ");
        return scanner.nextLine();
    }

    /**
     * input student age
     * 
     * @return student age
     */
    private byte inputAge() {
        System.out.print("Input student age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    /**
     * input student gpa
     * 
     * @return gpa
     */
    private double inputGpa() {
        System.out.print("Input student gpa: ");
        while (true) {
            try {
                double gpa = Float.parseFloat((scanner.nextLine()));
                if (gpa < 0.0 && gpa > 10.0) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }

    // getter && setter
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
