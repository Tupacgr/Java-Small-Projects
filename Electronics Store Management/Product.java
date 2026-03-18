class Product {
    private String name, isbn, description;
    private int quantity;
    private double price, weight;
    
    protected Product(String name, String isbn, String description, int quantity, double price, double weight) {
        this.name = name;
        this.isbn = isbn;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }
}