package duke;

/**
 * Extension of task that only contains a description of the task.
 */
public class ToDo extends Task {
    /**
     * Base constructor used by Duke to generate ToDo object.
     *
     * @param description Title of the task.
     * @throws DukeException If description is empty.
     */
    public ToDo(String description) throws DukeException {
        super(description);
        if (description.trim().length() == 0) {
            throw new DukeException("Please enter a description for this todo task");
        }
    }

    /**
     * Secondary constructor used by Duke to generate a ToDo object from a data txt file.
     *
     * @param logic Indicates if this task should be marked.
     * @param description Title of the task.
     * @throws DukeException If description is empty.
     */
    public ToDo(String logic, String description) throws DukeException {
        super(description);
        if (description.trim().length() == 0) {
            throw new DukeException("Please enter a description for this todo task");
        }
        switch (logic) {
        case "1":
            this.isDone = true;
            break;
        default:
            this.isDone = false;
            break;
        }
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
