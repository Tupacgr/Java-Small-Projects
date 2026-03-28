class Laptop extends Product {
   
   private String model, os, cpu, gpu;
   private double screenSize, storage, ram;
   private boolean isGaming;

   public String getModel () { return this.model; }
   public String getOs () { return this.os; }
   public String getCpu () { return this.cpu; }
   public String getGpu () { return this.gpu; }
   public double getScreenSize () { return this.screenSize; }
   public double getStorage () { return this.storage;}
   public double getRam () { return this.ram; }
   public boolean getIsGaming () { return this.isGaming; }

   public void setModel (String newModel) { this.model = newModel; }
   public void setOs (String newOs) { this.os = newOs; }
   public void setCpu (String newCpu) { this.cpu = newCpu; }
   public void setGpu (String newGpu) { this.gpu = newGpu; }
   public void setScreenSize (double newScreenSize) { this.screenSize = newScreenSize; }
   public void setStorage (double newStorage) { this.storage = newStorage; }
   public void setRam (double newRam) { this.ram = newRam; }
   public void setIsGaming (boolean newIsGaming) { this.isGaming = newIsGaming; }


   protected Laptop(String name, String code, String description, String rlDate, String color,
        int quantity, double price, double weight, String model, String os, String cpu, String gpu, double screenSize,
       double storage, double ram, boolean isGaming) {
           super(name, code, description, rlDate, color, quantity, price, weight);
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