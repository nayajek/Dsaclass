package SimpleToDoListSprint1;

public class User {
    private String name;
    private TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    //Add task to list
    public void addTask(String description) {
        taskList.addTask(description);
    }

    // Mark completed task
    public void markTaskAsCompleted(String description) {
        taskList.markTaskAsCompleted(description);
    }

    // Print task
    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }
}
