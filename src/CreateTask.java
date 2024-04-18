public class CreateTask implements Comparable<CreateTask>{
    private String title, description;
    private int priority;

    public CreateTask(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return title + " (" + description + ") Priority:  " + priority;
    }

    @Override
    public int compareTo(CreateTask o) {
        if (this.priority > o.priority) {
            return 1;
        } else if (this.priority < o.priority) {
            return -1;
        } else{
            return title.compareTo(o.title);
        }
    }
}

