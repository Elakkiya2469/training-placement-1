import java.util.*;

class Printer {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        Printer.printArray(intArray);
        Printer.printArray(stringArray);
    }
}
