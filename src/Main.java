import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static Scanner scanner = new Scanner(System.in); //to input stuff
    public static void main(String[] args) {


        ArrayList<String> tasks = new ArrayList<String>();




        System.out.println("Please choose an option:\n(1) Add a task. \n(2) Remove a task. \n(3) Update a task. \n(4) List all tasks. \n(0) Exit.");
        int selection;
        try {
            selection = scanner.nextInt();
            scanner.nextLine(); //Eat enter
        } catch(Exception e){
            System.out.println("Please enter a number between 0 and 4.");
            selection = scanner.nextInt();
            scanner.nextLine(); //Eat enter
        }


        while (selection != 0){ //Continue loop until user exits




            switch (selection) { //Caters to each user selection
                case 1: //Add task
                    addTask(tasks);
                    break;
                case 2: //Remove task
                    removeTask(tasks);


                    break;
                case 3: //update task
                    updateTask(tasks);


                    break;
                case 4: //List all tasks
                    System.out.println("Your current list of tasks is:");
                    System.out.println(tasks);
                    break;
            }
            System.out.println("Please choose an option:\n(1) Add a task. \n(2) Remove a task. \n(3) Update a task. \n(4) List all tasks. \n(0) Exit.");
            try {
                selection = scanner.nextInt();
                scanner.nextLine(); //Eat enter
            } catch(Exception e){
                System.out.println("Please enter a number between 0 and 4.");
                selection = scanner.nextInt();
                scanner.nextLine(); //Eat enter
            }
            //Continue or break the loop
        }; //exit the loop


        System.out.println("Goodbye!");//end program
    }
    public static ArrayList addTask(ArrayList a){
        System.out.println("Title for your task: ");
        String title = scanner.nextLine();
        System.out.println("Description for your task: ");
        String description = scanner.nextLine();
        System.out.println("Priorty for your task (0-5): ");

        int priority; //HERE THE ERROR IS HERE!!!!
        try {
            priority = scanner.nextInt();
            scanner.nextLine(); //Eat enter
        }catch(Exception e){
            System.out.println("Please enter a number 0-5");
            priority = scanner.nextInt();
            scanner.nextLine(); //Eat enter
        }
        CreateTask task = new CreateTask(title, description, priority);
        a.add(task);
        Collections.sort(a);
        System.out.println("Your new list of tasks is:");
        System.out.println(a);
        return a;
    }
    public static ArrayList removeTask(ArrayList a){
        System.out.println("Which task would you like to remove? (Please name the index, starting from 0)");
        System.out.println(a);
        scanner.nextLine(); //Prevents an "eating an enter" error...
        int b = scanner.nextInt();
        a.remove(b);
        System.out.println("Your new list of tasks is:");
        System.out.println(a);
        return a;
    }


    public static ArrayList updateTask(ArrayList a){
        System.out.println("Which task would you like to update? (Please name the index, starting from 0)");
        System.out.println(a);
        scanner.nextLine(); //Prevents an "eating an enter" error...
        int b = scanner.nextInt(); //get index
        System.out.println("What would you like to update it to?");
        scanner.nextLine();
        String c = scanner.nextLine(); //get value
        a.set(b, c);
        System.out.println("Your new list of tasks is:");
        System.out.println(a);
        return a;
    }






}



