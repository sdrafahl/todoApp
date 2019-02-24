package hello;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

public class TodoList {
    ArrayList<String> todos;
    private String file = "./src/main/txtfiles/todoList.txt";

    public TodoList() {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(this.file));
            this.todos = new ArrayList<String>();
            while(scanner.hasNextLine()) {
                this.todos.add(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public ArrayList<String> getTodoList() {
        return this.todos;
    }

    public void eliminateTodo(String todo) {
        try {
            this.todos.remove(todo);
            PrintWriter writer = new PrintWriter(this.file, "UTF-8");
            this.todos.forEach((todoString) -> writer.println(todoString));
            writer.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
