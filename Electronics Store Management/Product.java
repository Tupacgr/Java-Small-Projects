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
}