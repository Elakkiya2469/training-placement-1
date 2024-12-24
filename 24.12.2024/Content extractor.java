import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "<(.+?)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        while (n-- > 0) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);

            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }
        }

        scanner.close();
    }
                  }
