package Exception.Collection;

import java.util.Scanner;
import java.util.Stack;

public class StoreIntegers {

//    Stack class Creation
    Stack<Integer>stack=new Stack<>();

//    Method For Push Elements in the Stack
    public void pushElements(int number){
        stack.push(number);
        System.out.println(number+" Pushed into the Stack");
    }

//    Method For Pop Elements in the Stack

    public void PopElements(){
if (!stack.isEmpty()){
    int value=stack.pop();
    System.out.println(value+" Popped from the Stack");
}else{
    System.out.println("Stack is empty");
}

    }

//    Method For Display Elements in the Stack

    public void display(){
        System.out.println(stack);
    }

//    Method For checking stack empty or not
    public void isEmpty(){
       if (stack.isEmpty()){
           System.out.println("The Stack is Empty!");
       }else {
           System.out.println("The Stack is not Empty!");
       }
    }

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        StoreIntegers storeIntegers=new StoreIntegers();
        int choise;
        do {
            System.out.println("1. Push Elements");
            System.out.println("2. Pop Elements");
            System.out.println("3. Display Stack");
            System.out.println("4. isEmpty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choise=scanner.nextInt();
            scanner.nextLine();

            switch (choise){
                case 1:
                        System.out.println("Enter the Number for Push: ");
                        int pushnumber=scanner.nextInt();
                        storeIntegers.pushElements(pushnumber);
                        break;
                case 2:
                    storeIntegers.PopElements();
                    break;
                case 3:
                   storeIntegers.display();
                    break;
                case 4:
                    storeIntegers.isEmpty();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid number!... Try Again");
            }
        }while (choise!=5);
        scanner.close();
    }
}


