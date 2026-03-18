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

    protected void reduce(int x) {
        if (this.quantity - x >= 0) {
            this.quantity -= x;
            System.out.println("The quantity was reduced from " + 
            (this.quantity + x) + " to " + this.quantity);
        } else {
            System.out.println("Impossible! Cannot subtract " + x + " from " + this.quantity);
        }
    }

    protected void increase(int x) {
        this.quantity += x;
        System.out.println("The quantity was increased from " + (this.quantity - x) + " to " + this.quantity);
    }

    protected void changePrice(double x, String op) {
        switch (op) {
            case "+":
                this.price += x;
                System.out.println("The price of the product was increased from " + (this.price - x) + 
                " to " + this.price);
                break;
            case "-":
                if (this.price - x > 0) {
                    this.price -= x;
                    System.out.println("The price of the product was reduced from " + (this.price + x) + 
                    " to " + this.price);
                } else { System.out.println("Impossible! Cannot subtract " + x + " from " + this.price); }
                break;
        }
    }
}