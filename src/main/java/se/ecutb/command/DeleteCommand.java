package se.ecutb.command;

import se.ecutb.data.CourseDaoList;
import se.ecutb.data.StudentDaoList;

public class DeleteCommand extends Command {
    private final String type;

    public DeleteCommand(StudentDaoList studentDaoList, CourseDaoList courseDaoList, String type) {
        super(studentDaoList, courseDaoList);
        this.type = type;
    }

    @Override
    public void execute() {
        // Handle delete order and send to receiver.
    }
}
