package ReadFile;

import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;

public class ReadFile {
    public static void main(String[] args){
        try{
            File myFile = new File("filename.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            }
            else{
                System.out.println("File already exists.");
            }

            Scanner myRead = new Scanner((myFile));

            FileWriter myWrite = new FileWriter("filename.txt");
            myWrite.write("Acesta fila va scrie");
            myWrite.close();
            System.out.println("Mesajul a fost scris cu succes");

            while(myRead.hasNextLine()){
                String data = myRead.nextLine();
                System.out.println(data);
            }
            myRead.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
