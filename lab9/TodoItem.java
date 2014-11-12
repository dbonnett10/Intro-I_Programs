//******************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts
// Dan Bonnett
// CMPSC 111 Fall 2014
// Lab 9
// November 12 2014
//
// Purpose: To enhance our experience with designing, implementing, and enhancing Java methods.
// ******************************************

public class TodoItem {

    private int id;
    private static int nextId = 0;
    private String priority;
    private String category;
    private String task;
    private boolean done;

    public TodoItem(String p, String c, String t) {
        id = nextId;
        nextId++;
        priority = p;
        category = c;
        task = t;
        done = false;
    }

    public int getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    public String getTask() {
        return task;
    }

    public void markDone() {
        done = true;
    }

    public boolean isDone() {
        return done;
    }

    public String toString() {
        return new String(id + ", " + priority + ", " + category + ", " + task + ", done? " + done);
    }

}
