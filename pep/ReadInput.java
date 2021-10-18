//import java.io.*; 
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadInput{
  
    public static void main(String[] args) throws Exception{  
            System.out.println(checkPerson(args));
    }

    private static boolean checkPerson(String[] args) throws Exception{
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String firstName = "";
        String lastName = "";
        String argName = "";
        String argBirth = "";
        String birth = "";
        String mergedName = "";
        boolean found = false;

        try {
            
            br = new BufferedReader(new FileReader("PEP_listenNY.csv")); // Reads text from a character-input stream
            while ((line = br.readLine()) != null) { // read each line
                //comma as separator
                String[] title= line.split(cvsSplitBy);  // splitting each row
                lastName = title[0]; // 
                firstName = title[1];
                birth = title[3];

                mergedName = firstName + " " + lastName; // Merging first and last 
                argName = args[0];
                argBirth = args[1];

                if (mergedName.equals(argName)){ // comparing names with equales method - .equals() method for content comparison
                    Date tDate=new SimpleDateFormat("dd.MM.yyyy").parse(birth);
                    Date aDate=new SimpleDateFormat("dd.MM.yyyy").parse(argBirth);
                    if (0 == tDate.compareTo(aDate)){ // using date format so we are sure it is a real date
                        found = true;
                       /*  System.out.println("We found the person in the PEP-list:");
                        System.out.println("First name: " + title[1]);
                        System.out.println("Last name: " + title[0]);
                        System.out.println("Title: " + title[2]);
                        System.out.println("Birthday: " + title[3]); */
                        break;
                    } 
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (found){ // return true if found;
            return true;
        } else {
            return false;
        }
    }

}