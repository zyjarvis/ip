package duke.task;

public class Event extends Task {
    protected String date;

    public Event (String description, String date) {
        super(description);
        this.date = date;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + date + ")";
    }

    @Override
    public String save_toString() {
        return "E | " + super.save_toString() + "| " + date;
    }
}
