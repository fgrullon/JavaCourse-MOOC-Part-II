
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        //Create a arraylist to be retorne and a Scanner object giving the file as a parameter
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File(file));
        
        //We read the file and add line by line if it has a next line else we return the list
        while(reader.hasNextLine()){
            list.add(reader.nextLine());
        }
        
        return list;
    }

    public void save(String file, String text) throws IOException {
       FileWriter newFile = new FileWriter(file);
       
       newFile.write(text);
       newFile.close();
       
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter newFile = new FileWriter(file);
        
        for(String s : texts){
            newFile.write(s+"\n");
        }
        
        newFile.close();
    }
}
