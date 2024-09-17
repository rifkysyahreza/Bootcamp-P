package org.example;

import java.util.Scanner;

public class RunDSA {
    Scanner scanner = new Scanner(System.in);
    ErrorHandler errorHandler = new ErrorHandler();
    Stack stack = new Stack();
    Queue queue = new Queue();

    public void Run(){
        System.out.println("\n+++++++ Data Structure and Algorithm +++++++");
        System.out.println("1. Stack");
        System.out.println("2. Queue");
        System.out.println("3. Binary Search Tree");
        System.out.println("4. Exit");
        int choice = errorHandler.checkInt("Choose the data structure: ", scanner);

        switch (choice) {
            case 1:
                runStack();
                break;
            case 2:
                runQueue();
                break;
            case 3:
                System.out.println("Binary Search Tree");
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Please choose the correct data structure");
                Run();
                break;
        }

    }

    public void runStack(){
        try {
            boolean stackStatus = true;
            while (stackStatus) {
                System.out.print("Input number to push to stack or type 'q' to exit, 'p' to pop from stack, and 'k' to peek  : ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("q")) {
                    stackStatus = false;
                    continue;
                } else if (input.equalsIgnoreCase("p")) {
                    int poppedNumber = stack.pop();

                    if (poppedNumber == 0) {
                        continue;
                    }

                    continue;
                } else if (input.equalsIgnoreCase("k")) {
                    stack.peek();
                    continue;
                }else if (!input.matches("[0-9pPqQkK]+")) {
                    throw new Exception("Please input number");
                }

                stack.push(Integer.parseInt(input));
            }
        } catch (Exception e) {
            if (e.getMessage().equalsIgnoreCase("Please input number")) {
                System.out.println(e.getMessage());
                Run();
            } else {
                System.out.println("Please input number, 'p' to pop from stack or 'q' to exit");
            }
        } finally {
            scanner.close();
        }
    }

    public void runQueue(){
        try {
            boolean queueStatus = true;
            while (queueStatus) {
                System.out.print("Input number to enqueue to queue or type 'q' to exit, 'd' to dequeue from queue, and 'k' to peek  : ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("q")) {
                    queueStatus = false;
                    continue;
                } else if (input.equalsIgnoreCase("d")) {
                    queue.dequeue();
                    continue;
                } else if (input.equalsIgnoreCase("k")) {
                    queue.peek();
                    continue;
                }else if (!input.matches("[0-9dDqQkK]+")) {
                    throw new Exception("Please input number");
                }

                queue.enqueue(Integer.parseInt(input));
            }
        } catch (Exception e) {
            if (e.getMessage().equalsIgnoreCase("Please input number")) {
                System.out.println(e.getMessage());
                runQueue();
            } else {
                System.out.println("Please input number, 'd' to dequeue from queue or 'q' to exit");
            }
        } finally {
            scanner.close();
        }
    }
}
