package test.repository;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;

public class TodoListRepositoryTest {
    public static void main(String[] args) {
        testRemove();
    }

    public static void testRemove() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.add(new TodoList("Satu"));
        todoListRepository.add(new TodoList("Dua"));
        todoListRepository.add(new TodoList("Tiga"));
        todoListRepository.add(new TodoList("Empat"));
        todoListRepository.add(new TodoList("Lima"));

        var result = todoListRepository.remove(1);
        System.out.println(result); // true

        result = todoListRepository.remove(10);
        System.out.println(result); // false

        result = todoListRepository.remove(2);
        System.out.println(result); // true

        TodoList[] data = todoListRepository.getAll();
        for (var i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.println(i + ". " + data[i].getTodo());
            }
        }
    }
}
