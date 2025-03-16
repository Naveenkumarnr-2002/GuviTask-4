package Exception.Collection;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

// Generating Age not in Range Exception
class  AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}

// Generating Name not valid Exception
class  NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}

// Student Class Creation with Attributes
public class Student{
            int rollNo;
            String name;
            int age;
            String course;


//            Parameterized Constructor for Student Class
            public Student(int rollNo, String name, int age, String course)throws AgeNotWithinRangeException,NameNotValidException {

              if(age<15 || age>21){
                  throw new AgeNotWithinRangeException("AgeNotWithinRangeException!");
              }

              if (!name.matches("[a-zA-z ]+")){
                  throw new NameNotValidException("NameNotValidException!");
              }
                this.rollNo = rollNo;
                this.name = name;
                this.age = age;
                this.course = course;
            }

            public void display(){
                System.out.println("RollNo: "+rollNo);
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("Course: "+course);
    }
        }
 class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        try {

            System.out.println("Enter Student RollNo: ");
            int rollno = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.println("Enter Student age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Student Course: ");
            String course = scanner.nextLine();

            Student student=new Student(rollno,name,age,course);
            student.display();
        }

// Catching the  Age not in Range Exception

        catch (AgeNotWithinRangeException | NameNotValidException e){
            System.out.println("Exception: "+e.getMessage());
        }
// Catching the  Name Not Valid Exception

        catch (Exception e){
            System.out.println("Invalid Input!!");
        }
    }

}
