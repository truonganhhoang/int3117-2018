import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

class InitArray
{
    int [] Element;


}
class IOArray extends InitArray
{
    void input_file() throws FileNotFoundException
    {
        FileInputStream fi = new FileInputStream("input.txt");
        Scanner inp = new Scanner(fi,"UTF-8");
        String temp = inp.nextLine(); //doc dong mang trong file
        inp.close();
        String [] item = temp.split(" "); //tach chuoi thanh cac phan tu chuoi
        Element = new int[item.length];
        for(int i=0; i<item.length; i++) //doi kiem string sang int cua cac phan tu
        Element[i] = Integer.parseInt(item[i]);

    }
    void output_file() throws IOException
    {
        FileOutputStream fo = new FileOutputStream("output.txt");
        PrintWriter out = new PrintWriter(fo);
         for (int i = 0; i< Element.length; i++) {

                out.printf(Element[i]+" ");
         }

        out.close();
    }
    int Sum() throws  IOException{
        ArrayList<Integer> obj = new ArrayList<Integer>();
        for (int i = 0,sum = 0; i< Element.length; i++) {
            obj.add(Element[i]);
            out.printf(""+ sum );
        }
        int sum = 0;
        for (int i = 0; i< obj.size(); i++){
            sum = sum + obj.get(i);
        }

        return sum;
    }
}

class SortArray extends InitArray
{
    public void sort(IOArray A) //phuong thuc sap xep
    {
        Arrays.sort(A.Element);
    }
}

class SayHI
{
    public int a;
    public int b;
    public SayHI( int a, int b){
        this.a = a;
        this.b = b;
    }
    public int Sum() {
        int c[] = new int[10];
        c[1] = 2;
        for (int i = 1; i < 9; i ++){
            c[i+1] = c[i]+1;
        }
        int sum = 0;
        for (int i= 0 ; i < 9; i++){
            sum = sum + c[i];
        }
        return a+b+sum ;
    }
    public static void main(String[] args) throws IOException
    {
        IOArray Arr = new IOArray();
        Arr.input_file(); //nhap tu file
        SortArray SArr = new SortArray();
        SArr.sort(Arr);
        Arr.output_file(); //xuat ra file
        System.out.println(Arr.Sum());
        out.println("nSucces ! Open file output.txt to view");

    }

}