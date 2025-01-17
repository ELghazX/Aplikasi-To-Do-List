package service;

import repository.TodoListRepository;
import entity.TodoList;

public class TodoListServiceImpl implements TodoListService {
    private  TodoListRepository todoListRepository;


    public TodoListServiceImpl(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }


    @Override
    public void showTodoList() {
        System.out.println("TodoList");
        TodoList[] model = todoListRepository.getAll();
        for (var i = 0; i < model.length ; i++){
            var todo = model [i];
            var no = i+1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    @Override
    public void addTodoList(String todo) {

    }

    @Override
    public void removeTodoList(Integer number) {

    }
}

