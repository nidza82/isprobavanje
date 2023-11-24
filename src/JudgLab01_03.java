import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JudgLab01_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String pattern = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        Pattern regex = Pattern.compile(pattern);

        String input = scn.nextLine();

        Matcher matcher = regex.matcher(input);

        while(matcher.find())
        {
            System.out.print(matcher.group()+" ");
        }


    }
}
