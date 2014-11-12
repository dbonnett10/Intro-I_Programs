//******************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts
// Dan Bonnett
// CMPSC 111 Fall 2014
// Lab 9
// November 12 2014
//
// Purpose: To enhance our experience with designing, implementing, and enhancing Java methods.
// ******************************************

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class TodoList {

    private ArrayList<TodoItem> todoItems;
    private static final String TODOFILE = "todo.txt";

    public TodoList() {
        todoItems = new ArrayList<TodoItem>();
    }

    public void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    public Iterator getTodoItems() {
        return todoItems.iterator();
    }

    public void readTodoItemsFromFile() throws IOException {
        Scanner fileScanner = new Scanner(new File(TODOFILE));
        while(fileScanner.hasNext()) {
            String todoItemLine = fileScanner.nextLine();
            Scanner todoScanner = new Scanner(todoItemLine);
            todoScanner.useDelimiter(",");
            String priority, category, task;
            priority = todoScanner.next();
            category = todoScanner.next();
            task = todoScanner.next();
            TodoItem todoItem = new TodoItem(priority, category, task);
            todoItems.add(todoItem);
        }
    }

    public void markTaskAsDone(int toMarkId) {
        Iterator iterator = todoItems.iterator();
        while(iterator.hasNext()) {
            TodoItem todoItem = (TodoItem)iterator.next();
            if(todoItem.getId() == toMarkId) {
                todoItem.markDone();
            }
        }
    }

    public Iterator findTasksOfPriority(String requestedPriority) {
        ArrayList<TodoItem> priorityList = new ArrayList<TodoItem>();
        // TODO: Add source code that will find and return all tasks of the requestedPriority
        Iterator iterator = getTodoItems();
        while (iterator.hasNext()){
            TodoItem tempItem = (TodoItem)iterator.next();
            if (tempItem.getPriority().equals(requestedPriority)){
                priorityList.add(tempItem);
        // The source code that finds and returns all tasks of the requestedPriority
            }
        }
        return priorityList.iterator();
    }

    public Iterator findTasksOfCategory(String requestedCategory) {
        ArrayList<TodoItem> categoryList = new ArrayList<TodoItem>();
        // TODO: Add source code that will find and return all tasks for the requestedCategory
         Iterator iterator = getTodoItems();
        while (iterator.hasNext()){
            TodoItem tempItem = (TodoItem)iterator.next();
            if (tempItem.getCategory().equals(requestedCategory)){
                categoryList.add(tempItem);
        // The source code that finds and returns all tasks for the requestedcategory
            }
        }

        return categoryList.iterator();
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        Iterator iterator = todoItems.iterator();
        while(iterator.hasNext()) {
            buffer.append(iterator.next().toString());
            if(iterator.hasNext()) {
                buffer.append("\n");
            }
        }
        return buffer.toString();
    }

}
