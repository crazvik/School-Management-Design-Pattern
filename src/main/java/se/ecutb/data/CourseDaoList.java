package se.ecutb.data;

import se.ecutb.entity.Course;

import java.time.LocalDate;
import java.util.List;

public class CourseDaoList implements CourseDao {
    private final List<Course> courses;

    public CourseDaoList(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public Course saveCourse(Course course) {
        return course;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public List<Course> findByName(String name) {
        return null;
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public boolean removeCourse(Course course) {
        return false;
    }
}
