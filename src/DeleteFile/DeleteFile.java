package DeleteFile;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        File myDel = new File("filename.txt");
        if(myDel.delete()){
            System.out.println("Delete file: " +myDel.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
}
