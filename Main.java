import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        AirlineSystem system = new AirlineSystem();

        int choice;
        do{
            System.out.println("====AIRLINE MANAGMENT SYSTEM");
            System.out.println("1. View Flight");
            System.out.println("2. Search Flight");
            System.out.println("3. Cancel Flight");
            System.out.println("4. View Booking");
            System.out.println("EXIT");

            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                    system.viewFlights();
                break;
                case 2:
                    System.out.println("Enter Flight Number: ");
                    String flightNo = sc.nextLine();
                    
                    Flight flight = system.searchFlight(flightNo);
                    if(flight != null){
                        System.out.println(flight);
                    }else{
                        System.out.println("flight not found");
                    }
                break;
                case 3:
                    System.out.println("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    
                    System.out.println("Enter Passport Number");
                    String passport = sc.nextLine();

                    System.out.println("Enter flight number");
                    String flightNumber = sc.nextLine();

                    system.bookTicker(name, passport, flightNumber);
                break;
                case 4:
                    system.viewBookings();    
                break;    
                case 5:
                    System.out.println("Enter Passport Number: ");
                    String passengerNumber = sc.nextLine();

                    system.cancelBooking(passengerNumber);
                break;
                case 6:
                    System.out.println("Thanks for using our AIRLINE MANAGMENT SYSTEM"); 
                break;
                default:
                    System.out.println("Invalid Choice");
            }

        }while (choice != 6); {
            sc.close();
        }
    }
}