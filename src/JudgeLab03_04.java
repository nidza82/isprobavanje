import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JudgeLab03_04 {
    public static void main(String[] args) {
        /*
        Day: 13, Month: Jul, Year: 1928

        Day: 10, Month: Nov, Year: 1934
        Day: 25, Month: Dec, Year: 1937
        */
        Scanner scn = new Scanner(System.in);
        String pattern = "(?<dan>\\d{2})([\\/\\.-])(?<mesec>\\w{3})\\2(?<godina>\\d{4})";

        Pattern regex = Pattern.compile(pattern);

        String input = scn.nextLine();

        Matcher matcher = regex.matcher(input);

        while(matcher.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s\n",matcher.group("dan"),matcher.group("mesec"),matcher.group("godina"));
        }


    }
}
