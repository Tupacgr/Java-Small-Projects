import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    protected Scanner scObj = new Scanner(System.in);
    ArrayList<Product> arrPr = new ArrayList<>(); 
    public static void main(String[] args) {
        App myObj = new App();
        myObj.start();
    }

    public void start() {
        LocalDateTime ldt1 = LocalDateTime.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy & HH:mm:ss");
        String newLdt1 = ldt1.format(f1);
        System.out.println("Application access successful. Date & Time: " + newLdt1);
        String[] catalogueMain = {"1: Create a new Product", "2: View all the Smartphones Information", "3: View all the Laptops Information",
         "4: Search a Product and get it's Information", "5: Change a Product's Name", "6: Change a Product's Code", "7: Change a Product's Description",
          "8: Change a Product's Release Date", "9: Change a Product's Color", "10: Change a product's Quantity",  "11: Change a Product's Price", 
          "12: Change a Product's weight", "13: Exit"};
        String[] catalogueProd = {"1: Smartphone", "2: Laptop"};

        while (true) {
            byte choice = getInput(catalogueMain);
            byte c;
            String code;
            switch (choice) {
                case 1 -> {
                    c = getInput(catalogueProd);
                    switch (c) {
                        case 1 -> {
                            arrPr.add(createSm());
                            System.out.println();
                            System.out.println("A new Smartphone was added with the following information: ");
                            System.out.println(arrPr.get(arrPr.size() - 1));
                        }
                        case 2 -> {
                            arrPr.add(createLp());
                            System.out.println();
                            System.out.println("A new Laptop was added with the following information: ");
                            System.out.println(arrPr.get(arrPr.size() - 1));
                        }
                        default -> System.out.println("Please enter a valid number!");
                    }
                }
                case 2 -> viewCat(Smartphone.class, "All the Smartphones and their Information are:");
                case 3 -> viewCat(Laptop.class, "All the Laptops and their Information are:");
                case 4 -> {
                    code = rcCode();
                    prInfo(code);
                }
                case 5 -> {
                    code = rcCode();
                    chName(code);
                }
                case 6 -> {
                    code = rcCode();
                    chCode(code);
                }
                case 7 -> {
                    code = rcCode();
                    chDesc(code);
                }
                case 8 -> {
                    code = rcCode();
                    chRl(code);
                }
                case 9 -> {
                    code = rcCode();
                    chCo(code);
                }
                case 10 -> {
                    code = rcCode();
                    chQuan(code);
                }
                case 11 -> {
                    code = rcCode();
                    chPrice(code);
                }
                case 12 -> {
                    code = rcCode();
                    chWeight(code);
                }
                case 13 -> { 
                System.out.println("Exiting...");
                return;
                }
                default-> System.out.println("Please enter a valid number!");

            }
            System.out.println();
        }
    }

    public byte getInput(String[] catalogue) {
        System.out.println("Please type the number of your preferred choice (eg 1, 2, 3 etc...)");
        for (String c: catalogue) { System.out.println(c); }
        return Byte.parseByte(scObj.nextLine()); 
    }

    private String uniqueCode(boolean sign) {
        while (true) {
            if (sign) { System.out.println("Enter CODE: ");}
            else { System.out.println("Enter the new Code:");}
            String code = scObj.nextLine().trim();
            boolean flag = true;
            for (Product p: arrPr) {
                if (p.getCode().equals(code)) { 
                    System.out.println("Product with Code: " + code + " already exists!");
                    flag = false;
                    break;
                }
            }
            if (flag) { return code;}
        }
    }

    private Smartphone createSm() {

        System.out.println("Please provide all the following information: ");
        
        System.out.println("Enter Name: ");
        String name = scObj.nextLine().trim();
        
        String code = uniqueCode(true);
        
        System.out.println("Enter Description: ");
        String description = scObj.nextLine().trim();

        System.out.println("Enter Release Date: ");
        String rlDate = scObj.nextLine().trim();

        System.out.println("Enter Color: ");
        String color = scObj.nextLine().trim();
        
        System.out.println("Enter Quantity: ");
        int quantity = Integer.parseInt(scObj.nextLine());
        
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(scObj.nextLine());
        
        System.out.println("Enter Weight: ");
        double weight = Double.parseDouble(scObj.nextLine());

        System.out.println("Enter Model: ");
        String model = scObj.nextLine().trim();
        
        System.out.println("Enter OS: ");
        String os = scObj.nextLine().trim();
        
        System.out.println("Enter Screen Size: ");
        double screenSize = Double.parseDouble(scObj.nextLine());
        
        System.out.println("Enter Storage (GB): ");
        double storage = Double.parseDouble(scObj.nextLine());

        return new Smartphone(name, code, description, rlDate, color, quantity, price, weight, 
                              model, os, screenSize, storage);
    }

    private Laptop createLp() {

        System.out.println("Please provide all the following information: ");
        
        System.out.println("Enter Name: ");
        String name = scObj.nextLine().trim();
        
        String code = uniqueCode(true);
        
        System.out.println("Enter Description: ");
        String description = scObj.nextLine().trim();

        System.out.println("Enter Release Date: ");
        String rlDate = scObj.nextLine().trim();

        System.out.println("Enter Color: ");
        String color = scObj.nextLine().trim();
        
        System.out.println("Enter Quantity: ");
        int quantity = Integer.parseInt(scObj.nextLine());
        
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(scObj.nextLine());
        
        System.out.println("Enter Weight: ");
        double weight = Double.parseDouble(scObj.nextLine());

        System.out.println("Enter Model: ");
        String model = scObj.nextLine().trim();
        
        System.out.println("Enter OS: ");
        String os = scObj.nextLine().trim();

        System.out.println("Enter CPU model: ");
        String cpu = scObj.nextLine().trim();

        System.out.println("Enter GPU model: ");
        String gpu = scObj.nextLine().trim();
        
        System.out.println("Enter Screen Size: ");
        double screenSize = Double.parseDouble(scObj.nextLine());
        
        System.out.println("Enter Storage (GB): ");
        double storage = Double.parseDouble(scObj.nextLine());

        System.out.println("Enter RAM capacity (GB): ");
        double ram = Double.parseDouble(scObj.nextLine());

        boolean isGaming = false;
        while (true) {
        System.out.println("Is it considered a Gaming Laptop (Y for Yes or N for No)?");
        String ans = scObj.nextLine().trim().toUpperCase();

        if (ans.equals("Y")) {
            isGaming = true;
            break;
        } else if (ans.equals("N")) {
            isGaming = false;
            break;
        } else {System.out.println("Please enter Y for YES or N for No!");}
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

    private Product searchPr(String code) {
        for (Product p: arrPr) {
            if (p.getCode().equals(code)) { return p;}
        }
        System.out.println("Product with Code: " + code + " not found");
        return null;

    } 

    private void prInfo (String code) {
        Product p = searchPr(code);
        if (p!=null) {
            System.out.println(p); 
        }
    }

    private String rcCode() {
        System.out.println("Enter the Product's Code:");
        String code  = scObj.nextLine();
        return code;
    }

    private void chName(String code) {
        Product p = searchPr(code);
        if (p!=null) {
            System.out.println("Enter the new Name:");
            String newName = scObj.nextLine();
            p.setName(newName);
        }
    }

    private void chCode(String code) {
        Product p = searchPr(code);
        if (p!= null) {
            String newCode = uniqueCode(false);
            p.setCode(newCode);
        }
    }

    private void chDesc(String code) {
        Product p = searchPr(code);
        if (p!=null) {
            System.out.println("Enter the new Description:");
            String newDesc = scObj.nextLine();
            p.setDescription(newDesc);
        }
    }

    private void chRl(String code) {
        Product p = searchPr(code);
        if (p!=null) {
            System.out.println("Enter the new Release Date:");
            String newRl = scObj.nextLine();
            p.setRlDate(newRl);
        } 
    }

    private void chCo(String code) {
        Product p = searchPr(code);
        if (p!=null) {
            System.out.println("Enter the new Color:");
            String newColor = scObj.nextLine();
            p.setColor(newColor);
        } 
    }

    private void chQuan(String code) {
        Product p = searchPr(code);
        if (p!=null) {
            String[] arrC = {"Increase the product's quantity (type 1)", "Decrease the product's quantity (type 2)"};
            byte choice;
            while (true) {
                choice = getInput(arrC);
                if (choice == 1 || choice == 2) {
                    break;
                } else { System.out.println("Please enter a valid number (1 for increment, 2 for decrement)");}
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the quantity increment");
                    int num = Integer.parseInt(scObj.nextLine());
                    p.increaseQ(num);
                }
                case 2 -> {
                    System.out.println("Enter the quantity decrement (type a number greater than 0)");
                    int num = Integer.parseInt(scObj.nextLine());
                    p.reduceQ(num);
                }
            }
        }
    }

    private void chPrice(String code) {
        Product p = searchPr(code);
        if (p!=null) {
            String[] arrC = {"Increase the product's price (type 1)", "Decrease the product's price (type 2)"};
            byte choice;
            while (true) {
                choice = getInput(arrC);
                if (choice == 1 || choice == 2) {
                    break;
                } else { System.out.println("Please enter a valid number (1 for increment, 2 for decrement)");}
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the price increment");
                    double num = Double.parseDouble(scObj.nextLine());
                    p.increaseP(num);
                }
                case 2 -> {
                    System.out.println("Enter the price decrement (type a number greater than 0)");
                    double num = Double.parseDouble(scObj.nextLine());
                    p.decreaseP(num);
                }
            }
        }
    }

    private void chWeight(String code) {
        Product p = searchPr(code);
        if (p!=null) {
            System.out.println("Enter the new Weight:");
            double newWeight = Double.parseDouble(scObj.nextLine());
            if (newWeight > 0) { p.setWeight(newWeight);} 
            else {System.out.println("Weight cannot be <= 0!");}
        } 
    }
}