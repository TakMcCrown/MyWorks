package practice;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело " + todoList.get(todoList.size() - 1));
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index <= todoList.size() && index >= 0){
            todoList.add(index, todo);
            System.out.println("Добавлено дело " + todoList.get(index));
        } else {
            todoList.add(todo);
            System.out.println("Добавлено дело " + todoList.get(todoList.size() - 1));
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < todoList.size() && index >= 0) {
            System.out.println("Дело " + todoList.set(index, todo) + " заменено на " + todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index < todoList.size() && index >= 0) {
            todoList.remove(index);
            System.out.println("Дело " + todoList.get(index) + " удалено");
        } else {
            System.out.println("Дело с таким номером не сущетсвует");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
        return new ArrayList<>(todoList);
    }


}
