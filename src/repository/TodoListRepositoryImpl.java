package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
    public TodoList[] data = new TodoList[10];

    public boolean isFull(){
        // apakah model penuh?
        var isFull = true;
        for(var i = 0; i< data.length; i++){
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }
    public void resizeIfFull(){
       //jika penuh resize array

        if (isFull()){
            var temp = data;
            data = new TodoList[data.length *2];

            for (int i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }
    }


    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public void add(TodoList todoList) {
        resizeIfFull();
        for (var i = 0; i < data.length; i++){
            if (data[i] == null){
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= data.length) {
            return false;
        } else if ((data[number - 1]) == null) {
            return false;
        } else {
            for (var i = 0; i < data.length; i++) {
                if (i == data.length - 1) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}
