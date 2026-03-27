/* This Project is a WIP (Work In Progress)!! */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    protected Scanner scObj = new Scanner(System.in);
    ArrayList<Product> arrPr = new ArrayList<Product>(); 
    public static void main(String[] args) {
        App myObj = new App();
        myObj.start();
    }

    public void start() {
        String[] catalogueMain = {"1: Create a new Product", "2: View all the Smartphones Information", "3: View all the Laptops Information",
         "4: Search a Product and get it's Information", "5: Change a Product's name", "6: Change a Product's Code", "7: Change a Product's Description",
          "8: Change a Product's Release Date", "9: Change a Product's Color",  "10: Exit"};
        String[] catalogueProd = {"1: Smartphone", "2: Laptop"};

        while (true) {
            byte choice = getInput(catalogueMain);
            byte c;
            String code;
            switch (choice) {
                case 1:
                    c = getInput(catalogueProd);
                    switch (c) {
                        case 1:
                            arrPr.add(createSm());
                            System.out.println("A new Smartphone was added with the following information: ");
                            System.out.println(arrPr.get(arrPr.size() - 1));
                            break;
                        case 2:
                            arrPr.add(createLp());
                            System.out.println("A new Laptop was added with the following information: ");
                            System.out.println(arrPr.get(arrPr.size() - 1));
                            break;
                        default:
                            System.out.println("Please enter a valid number!");
                    }
                    break;
                case 2:
                    viewCat(Smartphone.class, "All the Smartphones and their Information are:");
                    break;
                case 3:
                    viewCat(Laptop.class, "All the Laptops and their Information are:");
                    break;
                case 4:
                    scObj.nextLine();
                    code = rcCode();
                    prInfo(code);
                    break;
                case 5:
                    scObj.nextLine();
                    code = rcCode();
                    chName(code);
                    break;
                case 6:
                    scObj.nextLine();
                    code = rcCode();
                    chCode(code);
                    break;
                case 7:
                    scObj.nextLine();
                    code = rcCode();
                    chDesc(code);
                    break;
                case 8:
                    scObj.nextLine();
                    code = rcCode();
                    chRl(code);
                    break;
                case 9:
                    scObj.nextLine();
                    code = rcCode();
                    chCo(code);
                    break;
                case 10: 
                System.out.println("Exiting...");
                return;
                default: System.out.println("Please enter a valid number!");
            }
            System.out.println();
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
        String name = scObj.nextLine().trim();
        
        System.out.println("Enter CODE: ");
        String code = scObj.nextLine().trim();
        
        System.out.println("Enter Description: ");
        String description = scObj.nextLine().trim();

        System.out.println("Enter Release Date: ");
        String rlDate = scObj.nextLine().trim();

        System.out.println("Enter Color: ");
        String color = scObj.nextLine().trim();
        
        System.out.println("Enter Quantity: ");
        int quantity = scObj.nextInt();
        
        System.out.println("Enter Price: ");
        double price = scObj.nextDouble();
        
        System.out.println("Enter Weight: ");
        double weight = scObj.nextDouble();

        scObj.nextLine(); 

        System.out.println("Enter Model: ");
        String model = scObj.nextLine().trim();
        
        System.out.println("Enter OS: ");
        String os = scObj.nextLine().trim();
        
        System.out.println("Enter Screen Size: ");
        double screenSize = scObj.nextDouble();
        
        System.out.println("Enter Storage (GB): ");
        double storage = scObj.nextDouble();

        scObj.nextLine();

        return new Smartphone(name, code, description, rlDate, color, quantity, price, weight, 
                              model, os, screenSize, storage);
    }

    private Laptop createLp() {
        scObj.nextLine(); // clears buffer

        System.out.println("Please provide all the following information: ");
        
        System.out.println("Enter Name: ");
        String name = scObj.nextLine().trim();
        
        System.out.println("Enter CODE: ");
        String code = scObj.nextLine().trim();
        
        System.out.println("Enter Description: ");
        String description = scObj.nextLine().trim();

        System.out.println("Enter Release Date: ");
        String rlDate = scObj.nextLine().trim();

        System.out.println("Enter Color: ");
        String color = scObj.nextLine().trim();
        
        System.out.println("Enter Quantity: ");
        int quantity = scObj.nextInt();
        
        System.out.println("Enter Price: ");
        double price = scObj.nextDouble();
        
        System.out.println("Enter Weight: ");
        double weight = scObj.nextDouble();

        scObj.nextLine(); 

        System.out.println("Enter Model: ");
        String model = scObj.nextLine().trim();
        
        System.out.println("Enter OS: ");
        String os = scObj.nextLine().trim();

        System.out.println("Enter CPU model: ");
        String cpu = scObj.nextLine().trim();

        System.out.println("Enter GPU model: ");
        String gpu = scObj.nextLine().trim();
        
        System.out.println("Enter Screen Size: ");
        double screenSize = scObj.nextDouble();
        
        System.out.println("Enter Storage (GB): ");
        double storage = scObj.nextDouble();

        System.out.println("Enter RAM capacity (GB): ");
        double ram = scObj.nextDouble();

        scObj.nextLine();

        boolean isGaming = false;
        while (true) {
        System.out.println("Is it considered a Gaming Laptop (Y for Yes or N for No)?");
        String ans = scObj.nextLine().trim().toUpperCase();

        boolean flag = false;
        switch (ans) {
            case "Y":
                isGaming = true;
                flag = true;
                break;
            case "N":
                isGaming = false;
                flag = true;
                break;
            default:
                System.out.println("Please enter Y for YES or N for No!");
        }
        if (flag) { break; }
        }

        return new Laptop (name, code, description, rlDate, color, quantity, price, weight, model, os, 
            cpu, gpu, screenSize, storage, ram, isGaming);
        
    }

    private void viewCat(Class<? extends Product> type, String msg) {
        System.out.println(msg);
        System.out.println();
        for (Product p: arrPr) {
            if (type.isInstance(p)) {
                System.out.println(p);
            }
        }
    }

    private void prInfo (String code) {
        boolean flag = true;
        for (Product p: arrPr) {
            if (p.getCode().equals(code)) { 
                flag = false;
                System.out.println(p); 
                break;
            }
        }
        if (flag) { System.out.println("Product with Code: " + code + " not found");}
    }

    private String rcCode() {
        System.out.println("Enter the Product's Code:");
        String code  = scObj.nextLine();
        return code;
    }

    private void chName(String code) {
        System.out.println("Enter the new Name:");
        String newName = scObj.nextLine();
        boolean flag = true;
        for (Product p: arrPr) {
            if (p.getCode().equals(code)) {
                p.setName(newName);
                flag = false;
                break;
            }
        }
        if (flag) { System.out.println("Product with Code: " + code + " not found");}
    }

    private void chCode(String code) {
        System.out.println("Enter the new Code:");
        String newCode = scObj.nextLine();
        boolean flag = true;
        for (Product p: arrPr) {
            if (p.getCode().equals(code)) {
                p.setCode(newCode);
                flag = false;
                break;
            }
        }
        if (flag) { System.out.println("Product with Code: " + code + " not found");}
    }

    private void chDesc(String code) {
        System.out.println("Enter the new Description:");
        String newDesc = scObj.nextLine();
        boolean flag = true;
        for (Product p: arrPr) {
            if (p.getCode().equals(code)) {
                p.setDescription(newDesc);
                flag = false;
                break;
            }
        }
        if (flag) { System.out.println("Product with Code: " + code + " not found");}
    }

    private void chRl(String code) {
        System.out.println("Enter the new Release Date:");
        String newRl = scObj.nextLine();
        boolean flag = true;
        for (Product p: arrPr) {
            if (p.getCode().equals(code)) {
                p.setRlDate(newRl);
                flag = false;
                break;
            }
        }
        if (flag) { System.out.println("Product with Code: " + code + " not found");}
    }

    private void chCo(String code) {
        System.out.println("Enter the new Color:");
        String newColor = scObj.nextLine();
        boolean flag = true;
        for (Product p: arrPr) {
            if (p.getCode().equals(code)) {
                p.setColor(newColor);
                flag = false;
                break;
            }
        }
        if (flag) { System.out.println("Product with Code: " + code + " not found");}
    }
}