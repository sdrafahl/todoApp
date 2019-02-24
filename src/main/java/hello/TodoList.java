package hello;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todos;

    public TodoList() {
        try {
            String file = "./src/main/txtfiles/todoList.txt";
            Scanner scanner = new Scanner(new File(file));
            this.todos = new ArrayList<String>();
            while(scanner.hasNextLine()) {
                this.todos.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public ArrayList<String> getTodoList() {
        return this.todos;
    }
}
