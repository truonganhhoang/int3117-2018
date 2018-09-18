package Bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Lớp này để kiểm tra lỗi FileNotFoundException
 * @author quynh
 */
public class FileNotFound {
    /**
     * Hàm này để chạy chương trình
     * @param args
     * @throws FileNotFoundException 
     */
    public static void main (String[] args) throws FileNotFoundException
    {
        try
        {
            Scanner inFile = new Scanner(new File("hello.txt"));
            String in = "";
            in = inFile.nextLine();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("file not found exception");
        }       
    }
}
