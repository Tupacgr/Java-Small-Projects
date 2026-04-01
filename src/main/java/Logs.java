import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Logs {
    protected static void logUse(String message) {
        File f1 = new File("logs.txt");
        boolean flag = true;
        if (f1.exists()) { flag = false;}

        try (FileWriter myObj = new FileWriter(f1, true);) {
            if (flag) { myObj.write("Logged in: " + message);}
            else { myObj.write("\nLogged in: " + message);}
        } catch (IOException e) { e.printStackTrace();}

    }
}