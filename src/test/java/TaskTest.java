import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void matchesSimpleTaskTrueTest() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesSimpleTaskFalseTest() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("Whats up!");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesMeetingTrueTest() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean expected = true;
        boolean actual = meeting.matches("НетоБанка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesMeetingFalseTest() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("Whats up!");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesEpicTrueTest() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(5, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Хлеб");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesEpicFalseTest() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(5, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Whats up!");
        Assertions.assertEquals(expected, actual);
    }
}