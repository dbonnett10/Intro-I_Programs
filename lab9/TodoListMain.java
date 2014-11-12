//******************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts
// Dan Bonnett
// CMPSC 111 Fall 2014
// Lab 9
// November 12 2014
//
// Purpose: To enhance our experience with designing, implementing, and enhancing Java methods.
// ******************************************

import java.io.IOException;
import java.util.Scanner;
import java.util.Iterator;

public class TodoListMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Todo List Manager!");
        System.out.println("What operation would you like to perform?");
        System.out.println("Available options: read, priority-search, category-search, done, list, quit");

        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while(scanner.hasNext()) {
            String command = scanner.nextLine();
            if(command.equals("read")) {
                todoList.readTodoItemsFromFile();
            }
            else if(command.equals("list")) {
                System.out.println(todoList.toString());
            }
            else if(command.equals("done")) {
                System.out.println("What is the id of the task?");
                int chosenId = scanner.nextInt();
                todoList.markTaskAsDone(chosenId);
            }
            else if (command.equals("priority-search"))        //Sets up the priority-search command
            {
                System.out.println("What is the priority of the task?");    //Asks the user to input the priority
                String priority = scanner.next();
                Iterator iterator = todoList.findTasksOfPriority(priority);
                while (iterator.hasNext())
                {
                    TodoItem tempItem = (TodoItem)iterator.next();
                    System.out.println(tempItem.toString());
                }
            }
            else if (command.equals("category-search"))     //Sets up the category-search command
            {
                System.out.println("What is the category of the task?");    //Asks the user to input the category
                String category = scanner.next();
                Iterator iterator = todoList.findTasksOfCategory(category);
                while (iterator.hasNext())
                {
                    TodoItem tempItem = (TodoItem)iterator.next();
                    System.out.println(tempItem.toString());
                }
            }


            else if(command.equals("quit")) {
                break;
            }
        }

    }

}
