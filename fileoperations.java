package fileoperations;
import java.io.*;
public class Filehandling {
    public static void main(String[] args)
    {
        try 
        {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("Hello, this is Java file handling.\nWelcome!");
            writer.close();
            System.out.println("File written successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing to file.");
        }
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
            String line;
            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            br.close();
        } 
        catch (IOException e)
        {
            System.out.println("Error reading file.");
        }
        try
        {           
            BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"));
            String line;
            System.out.println("Current file content:");
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
            reader.close();            
            FileWriter writer = new FileWriter("myfile.txt", true);
            writer.write("This is an additional line.\n");
            writer.close();
            System.out.println("New content added successfully.");
        } 
        catch (IOException e)
        {
            System.out.println("Error modifying file.");
        }
    }
}
