import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak1_01 {
    public static void main(String[] args) {
        String text = "Andy: 123 Marija: 4567";
        String pattern = "([A-Z][a-z]+): (?<number>\\d+)";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        //System.out.println(matcher.find());          // true
        while(matcher.find()) {
            System.out.println(matcher.group());         // Andy: 123
            System.out.println(matcher.group(0));        // Andy: 123
            System.out.println(matcher.group(1));        // Andy
            System.out.println(matcher.group(2));        // 123
            System.out.println(matcher.group("number")); // 123
        }

    }
}
