package FileClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderTwo {
    public static void main(String[] args) {
        String message;
        File file = new File("E:\\Sulav\\Java\\Project 1\\JavaCore\\src\\FileClass\\Output.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((message = br.readLine()) != null) {
                System.out.println(message);
            }
            br.close();
        }catch (Exception ex){
            System.out.println(ex.getClass()+" "+ex.getMessage());
        }
    }
}
