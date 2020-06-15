package Corona;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class File_Reader {
    public static void main(String[] args) throws Exception
    {
        
        File Corona_Csv = new File("./Corona/daily_reports/01-22-2020.csv");
        FileReader fr = new FileReader(Corona_Csv);

        // int i;
        // while((i = fr.read()) != -1){
        //     System.out.print((char) i);
        // }
        fr.close();

    }
    public static int csvCounter(File directory) {
        return directory.listFiles().length;
    }
}