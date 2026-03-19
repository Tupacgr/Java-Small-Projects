class Product {
    protected String name, isbn, description;
    protected int quantity;
    protected double price, weight;
    
    protected Product(String name, String isbn, String description, int quantity, double price, double weight) {
        this.name = name;
        this.isbn = isbn;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }

    protected void changeIsbn (String newI) {
        this.isbn = newI;
        System.out.println("ISBN changed successfully to " + this.isbn);
    }

    protected void changeWeight (double newW) {
        this.weight = newW;
        System.out.println("Weight changed successfully to " + this.weight);
    }

    protected void changeDesc (String newS) {
        this.description = newS;
        System.out.println("Description changed successfully to " + this.description);
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
            this.quantity -= 1;
            System.out.println("The Product was successfully sold for " + (this.price * (100.0 - discount)/100));
        } else { System.out.println("Product out of Stock"); }
    }
}