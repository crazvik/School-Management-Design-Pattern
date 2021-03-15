package se.ecutb.command;

import se.ecutb.data.CourseDaoList;
import se.ecutb.data.StudentDaoList;

public abstract class Command {
    public StudentDaoList studentDaoList;
    public CourseDaoList courseDaoList;

    public Command(StudentDaoList studentDaoList, CourseDaoList courseDaoList) {
        this.studentDaoList = studentDaoList;
        this.courseDaoList = courseDaoList;
    }

    public abstract void execute();
}
