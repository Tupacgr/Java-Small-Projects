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
        String[] listProducts = {"1: Smartphone"};
        while (true) {
            byte choice = getInput(catalogueMain);
            switch (choice) {
                case 1:
                    byte c = getInput(catalogueProd);
                    // Code here
                    break;
                case 2: return;
                default: System.out.println("Please enter a valid number!");
            }
        }
    }

    public byte getInput(String[] catalogue) {
        System.out.println("Please type the number of your preferred choice (eg 1, 2, 3 etc...)");
        for (String c: catalogue) { System.out.println(c); }
        return scObj.nextByte(); 
    }
}