public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String genDoneSymbol() {
        return isDone ? "X" : " ";
    }

    public void markAsDone() {
        isDone = true;
    }

    public void markAsUndone() {
        isDone = false;
    }

    public String toInputString() {
        return "task " + description;
    }

    public String toString() {
        return "[" + genDoneSymbol() + "] " + description;
    }
}
