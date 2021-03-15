package se.ecutb.command;

import se.ecutb.data.CourseDaoList;
import se.ecutb.data.StudentDaoList;

import java.time.LocalDate;
import java.util.Scanner;

public class ReadCommand extends Command {
    private final String type, action, email, name;
    private final int id;
    private final LocalDate localDate;

    public ReadCommand(StudentDaoList studentDaoList, CourseDaoList courseDaoList, String type,
                       String action, String email, String name, int id, LocalDate localDate) {
        super(studentDaoList, courseDaoList);
        this.type = type;
        this.action = action;
        this.email = email;
        this.name = name;
        this.id = id;
        this.localDate = localDate;
    }

    @Override
    public void execute() {
        // Handle read order and send to receiver.
    }
}