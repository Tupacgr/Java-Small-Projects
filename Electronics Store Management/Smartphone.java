class Smartphone extends Product {
    private String model, rlDate, color, os;
    private double screenSize, storage;
    
    protected Smartphone (String name, String isbn, String description, int quantity, double price, 
        double weight, String model, String rlDate, String color, String os, double screenSize, double storage) {
            super(name, isbn, description, quantity, price, weight);
            this.model = model;
            this.rlDate = rlDate;
            this.color = color;
            this.os = os;
            this.screenSize = screenSize;
            this.storage = storage;
        }

     public String toString() {
        return """
                Smartphone Details: 
                Name: %s
                ISBN: %s
                Description: %s
                Quantity: %s
                Price: %s
                Weight: %s
                Model: %s
                Release Date: %s
                Color: %s
                Operating System: %s
                Screen Size: %s
                Storage: %s
                """.formatted(this.name, this.isbn, this.description, this.quantity, this.price, this.weight, this.model, this.rlDate,
                    this.color, this.os, this.screenSize, this.storage);
     }
}