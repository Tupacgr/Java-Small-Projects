import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;

class Persistence {
    @SuppressWarnings("unchecked")
    protected static ArrayList<Product> deSerialization () {
        ArrayList<Product> arr1 = new ArrayList<>();
        File f1 = new File("data.ser");

        if (!f1.exists()) { return arr1;}

        try (ObjectInputStream oos1 = new ObjectInputStream(new FileInputStream(f1))) {
            arr1 = (ArrayList<Product>) oos1.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return arr1;
    }

    protected static void serialization (ArrayList<Product> arr1) {
        try (ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            oos1.writeObject(arr1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}