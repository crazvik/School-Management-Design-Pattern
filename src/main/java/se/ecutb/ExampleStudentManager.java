package se.ecutb;

import se.ecutb.data.CourseDaoList;
import se.ecutb.data.StudentDaoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ExampleStudentManager {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        StudentDaoList students = new StudentDaoList(new ArrayList<>());
        CourseDaoList courses = new CourseDaoList(new ArrayList<>());
        String type, action, email, name;
        int id;
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
                                email = scanner.nextLine();
                                manager.read(type, action, email, "", 0, LocalDate.MIN);
                                break;
                            case "name":
                                name = scanner.nextLine();
                                manager.read(type, action, "", name, 0, LocalDate.MIN);
                                break;
                            case "id":
                                id = Integer.parseInt(scanner.nextLine());
                                manager.read(type, action, "", "", id, LocalDate.MIN);
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
