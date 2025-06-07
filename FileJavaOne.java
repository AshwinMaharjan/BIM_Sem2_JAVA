package FileClass;

import java.io.*;

public class FileJavaOne {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\Sulav\\Java\\Project 1\\JavaCore\\src\\FileClass\\Test.txt");
        System.out.println(file1.canExecute());
        System.out.println(file1.canWrite());
        String message = "Hello World";
        try {
            FileWriter fileWriter = new FileWriter(file1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            bufferedWriter.close();
        }catch (IOException ex){
            System.out.println(ex.getClass()+" "+ex.getMessage());
        }
    }
}
