package se.ecutb;

import se.ecutb.data.CourseDaoList;
import se.ecutb.data.StudentDaoList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ExampleStudentManager {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        StudentDaoList students = new StudentDaoList(new ArrayList<>());
        CourseDaoList courses = new CourseDaoList(new ArrayList<>());
        String type, action;
        LocalDate localDate;
        StudentManager manager = new StudentManager(students, courses);

        System.out.print("Enter student or course: ");
        type = scanner.nextLine();
        switch (type.toLowerCase()) {
            case "student":
            case "course":
                System.out.println("Enter an action to take: ");
                action = scanner.nextLine();
                switch (action.toLowerCase()) {
                    case "save":
                        manager.save(type);
                        break;
                    case "delete":
                        manager.delete(type);
                        break;
                    case "read":
                        System.out.println("Enter an action to take: ");
                        action = scanner.nextLine();
                        switch (action.toLowerCase()) {
                            case "email":
                                System.out.println("Enter email to search for");
                                manager.read(type, action, scanner.nextLine(), "", 0, LocalDate.MIN);
                                break;
                            case "name":
                                manager.read(type, action, "", scanner.nextLine(), 0, LocalDate.MIN);
                                break;
                            case "id":
                                manager.read(type, action, "", "", Integer.parseInt(scanner.nextLine()), LocalDate.MIN);
                                break;
                            case "date":
                                localDate = LocalDate.parse(scanner.nextLine());
                                manager.read(type, action, "", "", 0, localDate);
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
