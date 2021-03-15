package se.ecutb.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private List<Student> students;

    public Course(int id, String courseName, LocalDate startDate, int weekDuration) {
        this.id = id;
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.students = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void register(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("\t" + student.getName() + " added to the course "
                    + getCourseName() + "\n");
        } else {
            System.out.println("\tAlready registered that student\n");
        }
    }

    public void unregister(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println("\t" + student.getName() + " removed from the course "
                    + getCourseName() + "\n");
        } else {
            System.out.println("\tStudent isn't registered to this course\n");
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", startDate=" + startDate +
                ", weekDuration=" + weekDuration +
                ", students=" + students +
                '}';
    }
}
