package Exception.Collection;


import java.util.Scanner;



class Weekdays {



    public static void main(String[]args){

//        Array for Storing WeekDays
        String[]weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};



        Scanner scanner=new Scanner(System.in);

        try {
//            Getting Day position for printing Day
            System.out.println("Enter the Day Position: ");
            int position = scanner.nextInt();

            System.out.println("The Day is: "+weekdays[position]);
        }

//        Handling Array out of Bound Exception
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Enter Valid Position!");
        }


    }

}
