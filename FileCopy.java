package FileClass;

import java.io.*;

public class FileCopy {
    public static void main(String[] args)throws Exception {
        try {
            File file1 = new File("E:\\Sulav\\Java\\Project 1\\JavaCore\\src\\FileClass\\Output.txt");
            File file2 = new File("E:\\Sulav\\Java\\Project 1\\JavaCore\\src\\FileClass\\Test.txt");
            FileReader fr = new FileReader(file1);
            FileWriter fw = new FileWriter(file2);
            String message;
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            while ((message = br.readLine()) != null) {
                bw.write(message);
            }
            br.close();
            bw.close();
        }catch (Exception ex){
            System.out.println(ex.getClass()+" "+ex.getMessage());
        }
        System.out.println("Successful");
    }
}
