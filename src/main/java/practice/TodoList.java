package practice;

import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> TODO_LIST = new ArrayList<>();

    public void add(String todo) {
        TODO_LIST.add(todo);
        System.out.println("Добавлено дело " + todo);

        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index < TODO_LIST.size()) {
            TODO_LIST.add(index, todo);
            System.out.println("Добавлено дело " + todo);
        } else {
            TODO_LIST.add(todo);
            System.out.println(("Добавлено дело " + todo));
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index < TODO_LIST.size()) {
            TODO_LIST.set(index, todo);
            System.out.println("Дело " + TODO_LIST.get(index) + " заменено на " + todo);
        } else {
            System.out.println("Несуществующий индекс");
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index < TODO_LIST.size()) {
            System.out.println("Дело " + TODO_LIST.get(index));
            TODO_LIST.remove(index);
            System.out.print("удалено");
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        for (int i = 0; i < TODO_LIST.size(); i++) {
            System.out.println(i + " - " + TODO_LIST.get(i));
        }
        // TODO: вернуть список дел
        return TODO_LIST;
    }
}