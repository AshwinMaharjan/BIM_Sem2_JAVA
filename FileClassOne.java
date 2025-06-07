package FileClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassOne  {
    public static void main(String[] args) {
        String message = "I had passed from Prime College";
        File file = new File("E:\\Sulav\\Java\\Project 1\\JavaCore\\src\\FileClass\\Output.txt");
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(message);
        } catch (IOException ex) {
            System.out.println(ex.getClass() + " " + ex.getMessage());
        } finally {
            try {
                bw.close();
            }catch (IOException | NullPointerException ex){
                System.out.println(ex.getClass()+" "+ex.getMessage());
            }
            }
         System.out.println("Successful");
        }
    }
