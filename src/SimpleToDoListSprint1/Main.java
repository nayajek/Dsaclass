package SimpleToDoListSprint1;

import java.util.Scanner;

public class Main {
    private static User[] users = new User[10];  // Max 10 users
    private static int userCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Manager:");
            System.out.println("1. Add User");
            System.out.println("2. Add Task to User");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks for User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addUser(scanner);
                    break;
                case 2:
                    addTaskToUser(scanner);
                    break;
                case 3:
                    markTaskAsCompleted(scanner);
                    break;
                case 4:
                    viewTasks(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addUser(Scanner scanner) {
        if (userCount >= users.length) {
            System.out.println("User limit reached.");
            return;
        }
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equals(username)) {
                System.out.println("User already exists.");
                return;
            }
        }

        users[userCount++] = new User(username);
        System.out.println("User " + username + " added.");
    }

    private static void addTaskToUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        User user = findUser(username);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Enter task description: ");
        String taskDescription = scanner.nextLine();
        user.addTask(taskDescription);
        System.out.println("Task added to " + username + "'s list.");
    }

    private static void markTaskAsCompleted(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        User user = findUser(username);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Enter task description to mark as completed: ");
        String taskDescription = scanner.nextLine();
        user.markTaskAsCompleted(taskDescription);
    }

    private static void viewTasks(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        User user = findUser(username);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        user.printTasks();
    }

    private static User findUser(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equals(username)) {
                return users[i];
            }
        }
        return null;
    }
}
