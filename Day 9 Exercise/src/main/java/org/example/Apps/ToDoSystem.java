package org.example.Apps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ToDoSystem implements ToDo{
    private ErrorHandler errorHandler = new ErrorHandler();
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, String[]> todos = new HashMap<>();
    private ArrayList<String> todoList = new ArrayList<>();

    @Override
    public void addTodo(String username) {
        System.out.println("===============");
        System.out.println("Add Todo");
        System.out.println("===============");
        System.out.print("What do you want to do: ");
        String todo = scanner.nextLine();

        todoList.add(todo);
        todos.put(username, todoList.toArray(new String[0]));
        System.out.println("Add todo success");
//        System.out.println("Your todo list: ");
//        int toDoNumber = 1;
//        for (String s : todos.get(username)){
//            System.out.println(toDoNumber + ". " + s);
//            toDoNumber++;
//        }

    }

    @Override
    public void viewTodo(String username) {
        System.out.println("===============");
        System.out.println("Your todo list");
        System.out.println("===============");

        try {
            int toDoNumber = 1;
            for (String s : todos.get(username)){
                System.out.println(toDoNumber + ". " + s);
                toDoNumber++;
            }
        } catch (Exception e) {
            System.out.println("You don't have any todo");
        }
    }

    @Override
    public void deleteTodo(String username) {
        System.out.println("===============");
        System.out.println("Delete Todo");
        System.out.println("===============");
        System.out.print("Choose todo number: ");
        int todoNumber = errorHandler.checkInt("", scanner);

        try {
            todoList.remove(todoNumber - 1);
            todos.put(username, todoList.toArray(new String[0]));
            System.out.println("Delete todo success");
        } catch (Exception e){
            System.out.println("Todo number not found");
        }

    }

    public void clearToDoListPreviousUser(){
        todoList.clear();
    }
}
