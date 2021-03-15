package se.ecutb.command;

import se.ecutb.data.CourseDaoList;
import se.ecutb.data.StudentDaoList;

public class SaveCommand extends Command {
    private final String type;

    public SaveCommand(StudentDaoList studentDaoList, CourseDaoList courseDaoList, String type) {
        super(studentDaoList, courseDaoList);
        this.type = type;
    }

    @Override
    public void execute() {
        // Handle save order and send it to the respective receiver.
    }
}
