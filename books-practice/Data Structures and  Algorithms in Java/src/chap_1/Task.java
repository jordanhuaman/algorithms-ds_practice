package src.chap_1;

import java.util.ArrayList;

public class Task {
  public enum Importance {
    EASY, MEDIUM, HARD
  }

  ArrayList<String> tasks = new ArrayList<String>();
  private final String name;
  private final int id;

  public Task(String name, int id, Importance importance) {
    this.name = name;
    this.id = id;
  }

  public ArrayList<String> getAllTasks() {
    return this.tasks;
  }

  public void addTask(String task) {
    this.tasks.add(task);
  }

  public void deleteOneTask(String taskDeleted) {
    for (String task : tasks) {
      if (task == taskDeleted) {
        tasks.remove(taskDeleted);
      } else {
        continue;
      }
    }
  }

  public static String returninfo(Task user) {
    return "info: " + user.id + user.name;
  }

  public static void main(String[] args) {
    ArrayList<Task> users = new ArrayList<Task>();
    users.add(new Task("null", 1, Importance.HARD));
    System.out.println(users);
  }
}
