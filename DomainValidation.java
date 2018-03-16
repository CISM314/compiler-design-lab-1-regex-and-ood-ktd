
package domainvalidationapp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainValidation {

String regex    =   "end$";
//String regex    =   "end\\Z";
String content = "www.kamogelomoatshe.co.za";
    public static void main(String[] args) {
                           
 String text = "http://kamogelo.co.za";

Pattern pattern = Pattern.compile(".co.za$");
Matcher matcher = pattern.matcher(text);

while(matcher.find()){
    System.out.println("Found match at: "  + matcher.start() + " to " + matcher.end());
}

    }}