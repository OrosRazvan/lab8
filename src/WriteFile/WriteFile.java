package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args){
        try {
            FileWriter myWrite = new FileWriter("filename.txt");
            myWrite.write("Acesta fila va scrie");
            myWrite.close();
            System.out.println("Mesajul a fost scris cu succes");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
