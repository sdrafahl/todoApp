package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/getTodoList")
    public TodoList getTodoList() {
        return new TodoList();
    }

    @RequestMapping("/removeTodoList")
    public TodoList removeTodoList(@RequestParam(value="todo") String todo) {
        TodoList todoList = new TodoList();
        todoList.eliminateTodo(todo);
        return todoList;
    }

    @RequestMapping("/addTodo")
    public TodoList addTodo(@RequestParam(value="todo") String todo) {
        TodoList todoList = new TodoList();
        todoList.addTodo(todo);
        return todoList;
    }
}
