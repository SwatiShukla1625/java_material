package assignment2;

import java.util.Scanner;

public class FlightBooking {
    public static void main(String[] args) {
        String[] destinations = {"New York","Paris","Malaysia","Sydney","Los Angeles"};
        searchDestination(destinations);
        updateDestination(destinations);
    }
    public static void searchDestination(String[] destinations) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the destination you want to search");
        String destination = sc.nextLine();

        boolean found = false;
        for (String dest : destinations) {
            if (dest.equalsIgnoreCase(destination)) {
                System.out.println("destination available : " + destination);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("destination is not available");
        }
    }
    public static void updateDestination(String[] destinations){
        System.out.println("enter current destination name for updation");
        Scanner sc = new Scanner(System.in);
        String oldDestination = sc.nextLine();
        System.out.println("enter new destination name");
        String newDestination = sc.nextLine();

      boolean  updated = false;
        for(int i=0;i<= destinations.length;i++){
            if(destinations[i].equalsIgnoreCase(oldDestination)){
                destinations[i] = newDestination;
                System.out.println("destination updated");
                updated = true;
                break;
            }
        }
        if(!updated){
            System.out.println("Destination not found");
        }
    }
}
