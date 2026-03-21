/* This Project is a WIP (Work In Progress)!! */

import java.util.Scanner;

public class App {
    protected Scanner scObj = new Scanner(System.in);
    public static void main(String[] args) {
        App myObj = new App();
        myObj.start();
    }

    public void start() {
        String[] catalogueMain = {"1: Create a new Product", "2: Exit"};
        String[] catalogueProd = {"1: Smartphone", "2: Laptop"};
        while (true) {
            byte choice = getInput(catalogueMain);
            switch (choice) {
                case 1:
                    byte c = getInput(catalogueProd);
                    switch (c) {
                        case 1:
                            Smartphone sm = createSm();
                            System.out.println(sm);
                            break;
                        case 2:
                            // Code here
                            break;
                        default:
                            System.out.println("Please enter a valid number!");
                    }
                    break;
                case 2: 
                System.out.println("Exiting...");
                return;
                default: System.out.println("Please enter a valid number!");
            }
        }
    }

    public byte getInput(String[] catalogue) {
        System.out.println("Please type the number of your preferred choice (eg 1, 2, 3 etc...)");
        for (String c: catalogue) { System.out.println(c); }
        return scObj.nextByte(); 
    }

    private Smartphone createSm() {
        scObj.nextLine(); // clears buffer

        System.out.println("Please provide all the following information: ");
        
        System.out.println("Enter Name: ");
        String name = scObj.nextLine();
        
        System.out.println("Enter ISBN: ");
        String isbn = scObj.nextLine();
        
        System.out.println("Enter Description: ");
        String description = scObj.nextLine();

        System.out.println("Enter Release Date: ");
        String rlDate = scObj.nextLine();

        System.out.println("Enter Color: ");
        String color = scObj.nextLine();
        
        System.out.println("Enter Quantity: ");
        int quantity = scObj.nextInt();
        
        System.out.println("Enter Price: ");
        double price = scObj.nextDouble();
        
        System.out.println("Enter Weight: ");
        double weight = scObj.nextDouble();

        scObj.nextLine(); 

        System.out.println("Enter Model: ");
        String model = scObj.nextLine();
        
        System.out.println("Enter OS: ");
        String os = scObj.nextLine();
        
        System.out.println("Enter Screen Size: ");
        double screenSize = scObj.nextDouble();
        
        System.out.println("Enter Storage (GB): ");
        double storage = scObj.nextDouble();

        scObj.nextLine();

        return new Smartphone(name, isbn, description, rlDate, color, quantity, price, weight, 
                              model, os, screenSize, storage);
    }
}