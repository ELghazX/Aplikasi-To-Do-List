package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testAddTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Tidur");
        todoListRepository.data[1] = new TodoList("Belajar");
        todoListRepository.data[2] = new TodoList("workout");
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService  todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("belajar");
        todoListService.addTodoList("ngoding");
        todoListService.addTodoList("tidur");

        todoListService.showTodoList();
    }

}