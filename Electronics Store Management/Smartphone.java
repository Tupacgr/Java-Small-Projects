class Smartphone extends Product {
    private String model, os;
    private double screenSize, storage;

    public String getModel () { return this.model; }
    public String getOs () { return this.os; }
    public double getScreenSize () { return this.screenSize; }
    public double getStorage () { return this.storage;}

    public void setModel (String newModel) { this.model = newModel; }
    public void setOs (String newOs) { this.os = newOs; }
    public void setScreenSize (double newScreenSize) { this.screenSize = newScreenSize; }
    public void setStorage (double newStorage) { this.storage = newStorage; }
   
    protected Smartphone (String name, String isbn, String description, String rlDate, String color,
         int quantity, double price, double weight, String model, String os, double screenSize, double storage) {
            super(name, isbn, description, rlDate, color, quantity, price, weight);
            this.model = model;
            this.os = os;
            this.screenSize = screenSize;
            this.storage = storage;
        }

    @Override
    public String toString() {
        String text = """
        Smartphone Details:
        %s
        Model: %s
        Operating System: %s
        Screen Size: %s
        Storage: %s
        """.formatted(super.toString() ,this.model, this.os, this.screenSize, this.storage);
        return text;
     }
}