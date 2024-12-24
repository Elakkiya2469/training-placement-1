
import java.util.BitSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int size = scanner.nextInt();
        int operationsCount = scanner.nextInt();
        
     
        BitSet bitSet1 = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        for (int i = 0; i < operationsCount; i++) {
            String operation = scanner.next();
            int index1 = scanner.nextInt();
            
         
            switch (operation) {
                case "AND":
                    int index2 = scanner.nextInt();
                    bitSet1.and(bitSet2);
                    break;
                case "OR":
                    index2 = scanner.nextInt();
                    bitSet1.or(bitSet2);
                    break;
                case "XOR":
                    index2 = scanner.nextInt();
                    bitSet1.xor(bitSet2);
                    break;
                case "FLIP":
                    bitSet1.flip(index1);
                    break;
                case "SET":
                    bitSet1.set(index1);
                    break;
            }
           
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }

        scanner.close();
    }
            }
