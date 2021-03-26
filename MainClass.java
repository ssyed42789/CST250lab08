
package mainclass;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class MainClass {

   
    public static void main(String[] args) {
        
        ArrayList<Camera> cameras = new ArrayList();
        
        try{
            File myFile = new File("");
            Scanner fileScanner = new Scanner(myFile);
            while(fileScanner.hasNextLine()){
                String cameraRow = fileScanner.nextLine();
                String[] cameraProperties = cameraRow.split(",");
                System.out.println(cameraProperties[0]);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error occurred...");
            System.out.println("Error message: " + e.getMessage());
        }
    }
     
}
       