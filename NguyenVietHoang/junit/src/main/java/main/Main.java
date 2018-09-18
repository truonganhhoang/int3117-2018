package main;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentId;

        showMenu();
        while (true) {
            Integer choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
            case 1:
                studentManager.add();
                break;
            case 2:
                studentId = studentManager.inputId();
                studentManager.edit(studentId);
                break;
            case 3:
                studentId = studentManager.inputId();
                studentManager.delete(studentId);
                break;
            case 4:
                studentManager.sortStudentByGPA();
                studentManager.show();
                break;
            case 5:
                studentManager.sortStudentByName();
                studentManager.show();
                break;
            case 6:
                studentManager.show();
                break;
            case 0:
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
