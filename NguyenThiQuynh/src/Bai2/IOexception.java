package Bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hàm này dùng để kiểm tra lỗi IOexception
 * @author quynh
 */
public class IOexception {
    /**
     * Hàm này dùng để đọc file
     */
    public static void main (String[] args) throws IOException
    {
        try {
                File inFile = new File("Hello.txt");
                FileReader fileReader = new FileReader(inFile);
                BufferedReader read = new BufferedReader(fileReader);
                String s = null;
            
                while((read.readLine()) != null) {
                    s = read.readLine();
                    System.out.println(s);
                }
                read.close();
            } 
            catch (IOException e) {
                System.out.println("File not found");
        }
    }
}
