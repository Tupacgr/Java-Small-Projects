import java.io.Serializable;

abstract class Product implements Serializable{
    private String name, code, description, rlDate, color;
    private int quantity;
    private double price, weight;

    public String getName () { return this.name; }
    public String getCode () { return this.code; }
    public String getDescription () { return this.description; }
    public String getRlDate () { return this.rlDate; }
    public String getColor () { return this.color; }
    public int getQuantity () { return this.quantity; }
    public double getPrice () { return this.price; }
    public double getWeight () { return this.weight; }

    public void setName (String newName) { 
        System.out.println("Name changed successfully from " + this.name + " to " + newName);
        this.name = newName;
         }

    public void setCode (String newCode) { 
        System.out.println("Code changed successfully from " + this.code + " to " + newCode);
        this.code = newCode; }

    public void setDescription (String newDescription) { 
        System.out.println("Description changed successfully from " + this.description + " to " + newDescription);
        this.description = newDescription; }

    public void setRlDate (String newRldate) { 
        System.out.println("Release Date changed successfully from " + this.rlDate + " to " + newRldate);
        this.rlDate = newRldate; }

    public void setColor (String newColor) { 
        System.out.println("Color changed successfully from " + this.color + " to " + newColor);
        this.color = newColor; }

    public void setWeight (double newWeight) { 
        System.out.println("Weight changed successfully from " + this.weight + " to " + newWeight);
        this.weight = newWeight; }
   
    protected Product(String name, String code, String description, String rlDate, String color,
         int quantity, double price, double weight) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.rlDate = rlDate;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }

    protected void reduceQ (int x) {
        if (this.quantity - x >= 0) {
            this.quantity -= x;
            System.out.println("The quantity was reduced from " +
            (this.quantity + x) + " to " + this.quantity);
        } else {
            System.out.println("Impossible! Cannot subtract " + x + " from " + this.quantity);
        }
    }

    protected void increaseQ(int x) {
        this.quantity += x;
        System.out.println("The quantity was increased from " + (this.quantity - x) + " to " + this.quantity);
    }

    protected void increaseP(double x) {
        this.price += x;
        System.out.println("The price of the product was increased from " + (this.price - x) +
                " to " + this.price);
    }

    protected void decreaseP(double x) {
        if (this.price - x > 0) {
                    this.price -= x;
                    System.out.println("The price of the product was reduced from " + (this.price + x) +
                    " to " + this.price);
                } else { System.out.println("Impossible! Cannot subtract " + x + " from " + this.price); }
    }

    protected void buy(double discount) {
        if (this.quantity > 0) {
            this.reduceQ(1);
            System.out.println("The Product was successfully sold for " + (this.price * (100.0 - discount)/100));
        } else { System.out.println("Product out of Stock"); }
    }

    public String toString() {
        return """
        Name: %s
        CODE: %s
        Description: %s
        Release Date: %s
        Color: %s
        Quantity: %s
        Price: %s
        Weight: %s""".formatted(this.name, this.code, this.description, this.rlDate, this.color, this.quantity, this.price, this.weight);
    }
}