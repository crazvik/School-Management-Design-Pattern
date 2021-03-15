package se.ecutb;

import se.ecutb.command.Command;
import se.ecutb.command.DeleteCommand;
import se.ecutb.command.ReadCommand;
import se.ecutb.command.SaveCommand;
import se.ecutb.data.CourseDaoList;
import se.ecutb.data.StudentDaoList;

import java.time.LocalDate;

public class StudentManager {
    private final StudentDaoList studentDaoList;
    private final CourseDaoList courseDaoList;

    public StudentManager(StudentDaoList studentDaoList, CourseDaoList courseDaoList) {
        this.studentDaoList = studentDaoList;
        this.courseDaoList = courseDaoList;
    }

    public void save(String type) {
        // Send save order to invoker.
        executeCommand(new SaveCommand(studentDaoList, courseDaoList, type));
    }

    public void delete(String type) {
        // Send delete order to invoker.
        executeCommand(new DeleteCommand(studentDaoList, courseDaoList, type));
    }

    public void read(String type, String action, String email, String name, int id, LocalDate localDate) {
        // Send read order to invoker.
        executeCommand(new ReadCommand(studentDaoList, courseDaoList, type, action, email, name, id, localDate));
    }

    private void executeCommand(Command command) {
        command.execute();
    }
}
