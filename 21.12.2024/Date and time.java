import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        SimpleDateFormat format1 = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");

        try {
            Date date = format1.parse(time);
            System.out.println(format2.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
