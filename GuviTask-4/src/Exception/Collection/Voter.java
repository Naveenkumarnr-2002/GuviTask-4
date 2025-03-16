package Exception.Collection;

import java.util.Scanner;

// Checked Exception
class VoterAge extends Exception{
    public VoterAge (String message){
        super(message);
    }
}

// Voter Class Creation with Attributes
public class Voter {

    int voterId;
    String name;
    int age;

//    Parameterized Constructor for Voter Classs
    public Voter(int voterId, String name, int age) throws VoterAge {

        if (age<18){
            throw new VoterAge("Invalid Age of Voter!");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

//    Method to Display input
    public void display(){
        System.out.println("Voter Id: "+voterId);
        System.out.println("Voter Name: "+name);
        System.out.println("Voter Age: "+age);

    }

    public static void main(String[]args) throws VoterAge {

        Scanner scanner=new Scanner(System.in);

        try{

        System.out.println("Enter voter Id: ");
        int voterId=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter voter Name: ");
        String name=scanner.nextLine();

        System.out.println("Enter voter Age: ");
        int age=scanner.nextInt();

        Voter voter=new Voter(voterId,name,age);
        voter.display();
        }
        catch (VoterAge e){
            System.out.println("Exception: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Invalid Input!!");
        }
    }
}