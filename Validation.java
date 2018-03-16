
package validationapp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validation {

    private static Object JOptionpane;
    
    

    public static void main(String[] args) {
       String input = "0749130367";
     
     
       if (valPhone(input)){
           System.out.println("Valid");
       }
       else {
           System.out.println("Invalid");
       } 
         
         
    }
  public static boolean valPhone(String in){
      
      return in.charAt(0)== '0' && in.charAt(1)== '1'|| in.charAt(1)=='8' || in.charAt(1)==6  || in.charAt(1)==1 || in.charAt(1)=='7' && in.length() == 10 && in.matches("[0-9]+");
  }}



