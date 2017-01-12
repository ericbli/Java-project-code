package todolist;



import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Todo {

    public static void main(String[] args) {
        int counter = 0;
        // Make a scanner to read in items.
        Scanner scanner = new Scanner(System.in);
        // Our data model
        TodoList data = new TodoList();

        // print commands available to the user
        System.out.println("Commands are: exit, add, del, rename, mark, unmark, find, list, cleardone, save, load");

        // Loop until the user exits.
        mainloop:
        while (true) {
            // read in commands
            String command = scanner.next();

            switch (command) {
                case "exit": {
                    System.out.println("Exiting");

                    // exit by break'ing to the labelled statement
                    break mainloop;
                }
                case "list": {
                    System.out.println(data.items.size() + " items in todo");
                    counter = 0;

                    // utilize a for-each loop to go through the items.
                    for (TodoItem item : data.items) {
                        System.out.println(counter + " : " + item);
                        counter++;
                    }
                    break;
                }
                case "add": {
                    System.out.println("Type in the todo item name to add");
                    String newItem = scanner.next();

                    // add a new item unless it's an empty string.
                    if (newItem.length() != 0) {
                        data.items.add(new TodoItem(newItem));
                        System.out.println("Added " + newItem);
                    }
                    break;
                }
                case "find": {
                    System.out.println("Type in a search term for the todo item");
                    String search = scanner.next();
                    scanner.nextLine();

                    // again the for-each loop to go through items.
                    for (TodoItem item : data.items) {
                        // but do a check for items that matches.
                        if (!item.name.contains(search)) {
                            continue; // this early exit will skip the rest of the for-each loop body
                        }
                        // only items that matched the contains function
                        // above will enter this code path.
                        System.out.println(item);
                    }
                    break;
                }
                case "mark":
                case "unmark": {
                    System.out.println("Type index of the item to " + command);
                    boolean cont = true;
                    int item = 0;
                    while (cont) {
                        try {
                            item = scanner.nextInt();
                            scanner.nextLine();
                            cont = false;
                        } // change the item at the index.
                        catch (InputMismatchException ime) {
                            scanner.nextLine();
                            cont = true;
                        }
                    }

                    data.items.get(item).done = command.equals("mark");

                    break;
                }
                case "rename": {
                    System.out.println("Type in index of items to rename");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    
                            if (index > data.items.size() - 1) {
                                throw new InputMismatchException();

                            }

                    // rename the item at the index
                    System.out.println("Renaming " + data.items.get(index).name + " to:");
                    data.items.get(index).name = scanner.nextLine();

                    break;
                }
                case "del": {
                    System.out.println("Type in the todo item index to delete");
                    boolean cont = true;
                    int toRemove = 0;
                    while (cont) {
                        try {
                            toRemove = scanner.nextInt();
                            cont = false;
                            if (toRemove > data.items.size() - 1) {
                                throw new InputMismatchException();

                            }

                            System.out.println("Item with index " + toRemove + " Was removed");

                        } catch (InputMismatchException ime) {
                            System.out.println("Wrong input");
                            scanner.nextLine();
                            cont = true;
                        }
                    }

                    // remove the item at the index.
                    data.items.remove(toRemove);

                    break;
                }

                case "cleardone": {
                    // use a lambda with removeIf,
                    // this one simply tests for the done status
                    if (data.items.removeIf((item) -> item.done)) {
                        System.out.println("Removed done items");          
                    }
                    break;
                }
                case "save": {
                    // Using XmlIO to save the file, errors are unexpected (write protected files)
                    try {
                        XMLIO.saveObject("todolist.xml", data);
                        break;
                    } catch (IOException ex) {
                        Logger.getLogger(Todo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                case "load": {
                    // Loading with XmlIO, in this case the file might be missing.
                    try {
                        data = XMLIO.loadObject("todolist.xml", TodoList.class);
                    } catch (IOException ex) {
                        System.out.println("Could not load todolist.xml");
                    }
                    break;
                }
                default:
                    System.out.println("Unknown command " + command);
                    break;
            }
        }
    }
}
