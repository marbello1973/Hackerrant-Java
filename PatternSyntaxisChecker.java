import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSyntaxisChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        while(testCases > 0){
            String line = sc.nextLine();
            //Write your code here
            Pattern patron = Pattern.compile("<(.+)>([^<>]+)</\\1>");
            //Pattern patron = Pattern.compile("<([a-zA-Z][a-zA-Z0-9]*)\\\\b[^>]*>(.*?)</\\\\1>");
            Matcher matcher = patron.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group(2));
            }

            matcher.reset();

            if(!matcher.find()){
                System.out.println("None");
            }
            testCases--;
        }
        sc.close();
    }
}
//<Amee>safat codes like a ninja</amee>
//<h1>Nayeem loves counseling</h1>