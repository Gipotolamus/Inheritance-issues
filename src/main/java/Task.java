import java.util.Objects;

public class Task {
    protected int id;
    protected String title;
    protected String subtasks;
    protected String topic;
    protected String project;
    protected String start;

    public Task(int id) {
        this.id = id;
    }

    public Task(String title, String subtasks, String topic, String project, String start) {
        this.title = title;
        this.subtasks = subtasks;
        this.topic = topic;
        this.project = project;
        this.start = start;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtasks() {
        return subtasks;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    public boolean matches(String query) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
