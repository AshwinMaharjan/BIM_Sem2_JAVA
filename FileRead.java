package FileClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) {
        File file = new File("E:\\Sulav\\Java\\Project 1\\JavaCore\\src\\FileClass\\Test.txt");
        String message;
        try{
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while((message=bufferedReader.readLine())!=null){
                System.out.println(message);
            }
            bufferedReader.close();
        }catch (Exception ex){
            System.out.println(ex.getClass()+" "+ex.getMessage());
        }
    }
}
