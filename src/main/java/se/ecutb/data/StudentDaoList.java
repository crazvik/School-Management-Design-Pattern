package se.ecutb.data;

import se.ecutb.entity.Student;

import java.util.List;

public class StudentDaoList implements StudentDao {
    private final List<Student> students;

    public StudentDaoList(List<Student> students) {
        this.students = students;
    }

    @Override
    public Student saveStudent(Student student) {
        return student;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public boolean deleteStudent(Student student) {
        return false;
    }
}
