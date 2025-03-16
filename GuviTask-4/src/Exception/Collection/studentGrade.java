package Exception.Collection;

import java.util.HashMap;
import java.util.Scanner;

public class studentGrade {

//  Hashmap Creation
   HashMap<String, Integer> studentGrades = new HashMap<>();


  // Method to add a student
  public void addStudent(String name, int grade) {
    studentGrades.put(name, grade);
    System.out.println(name + " added with grade: " + grade);
  }

  // Method to remove a student
  public void removeStudent(String name) {
    if (studentGrades.containsKey(name)) {
      studentGrades.remove(name);
      System.out.println(name + " removed from the system.");
    } else {
      System.out.println(name + " not found.");
    }
  }

  // Method to display a student's grade by name
  public void displayStudentGrade(String name) {
    if (studentGrades.containsKey(name)) {
      System.out.println(name + "'s grade: " + studentGrades.get(name));
    } else {
      System.out.println(name + " not found.");
    }
  }

  public static void main(String[] args) {
    studentGrade sm = new studentGrade();
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\nStudent Management System:");
      System.out.println("1. Add Student");
      System.out.println("2. Remove Student");
      System.out.println("3. Display Student Grade");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          System.out.print("Enter student name: ");
          String name = scanner.nextLine();
          System.out.print("Enter student grade: ");
          int grade = scanner.nextInt();
          sm.addStudent(name, grade);
          break;
        case 2:
          System.out.print("Enter student name to remove: ");
          String removeName = scanner.nextLine();
          sm.removeStudent(removeName);
          break;
        case 3:
          System.out.print("Enter student name to display grade: ");
          String displayName = scanner.nextLine();
          sm.displayStudentGrade(displayName);
          break;
        case 4:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice! Try again.");
      }
    } while (choice != 4);

    scanner.close();
  }
}

