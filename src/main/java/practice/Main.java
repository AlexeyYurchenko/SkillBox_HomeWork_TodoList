package practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        String get = "^(LIST)";
        String add = "^(ADD)\\s(\\D)+";
        String edit = "^(EDIT)\\s(\\d)+\\s(\\D)+";
        String delete = "^(DELETE)\\s(\\d)+";

        while (true) {
            String input = new Scanner(System.in).nextLine();
            String[] words = input.split("\\s", 3);
            String todo = "Неверная команда";
            int index;

            if (input.isEmpty()) {
                break;
            } else if (input.matches(add)) {
                todo = input.substring(4);
                todoList.add(todo);
            } else if (input.matches(edit)) {
                index = Integer.parseInt(words[1]);
                todo = words[2];
                todoList.edit(index, todo);
            } else if (input.matches(get)) {
                todoList.getTodos();
            } else if (input.matches(delete)) {
                index = Integer.parseInt(words[1]);
                todoList.delete(index);
            } else {
                System.out.println(todo);
            }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
