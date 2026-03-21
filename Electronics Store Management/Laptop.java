class Laptop extends Product {
    protected String model, os, cpu, gpu;
    protected double screenSize, storage, ram;
    protected boolean isGaming;

    protected Laptop(String name, String isbn, String description, String rlDate, String color,
         int quantity, double price, double weight, String model, String os, String cpu, String gpu, double screenSize,
        double storage, double ram, boolean isGaming) {
            super(name, isbn, description, rlDate, color, quantity, price, weight);
            this.model = model;
            this.os = os;
            this.cpu = cpu;
            this.gpu = gpu;
            this.screenSize = screenSize;
            this.storage = storage;
            this.ram = ram;
            this.isGaming = isGaming;
         }
    
         @Override 
         public String toString() {
            String text = """
            Laptop Details:
            %s
            Model: %s
            Operating System: %s
            CPU: %s
            GPU: %s
            Screen Size: %s
            Storage: %s
            RAM: %s
            ISGAMING: %s
            """.formatted(super.toString(), this.model, this.os, this.cpu, this.gpu, this.screenSize, 
            this.storage, this.ram, this.isGaming);
            return text;
         }
}