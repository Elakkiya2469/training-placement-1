import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s=in.next();
        try
        {
            int n=Integer.parseInt(s);
            System.out.println(n);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Bad String");
        }

    }
}
