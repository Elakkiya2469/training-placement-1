import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int pos) {
        if (pos >= game.length) {
            return true; 
        }
        if (pos < 0 || game[pos] == 1) {
            return false; 
        }
        game[pos] = 1;
        return isSolvable(leap, game, pos + leap) ||
               isSolvable(leap, game, pos + 1) ||   
               isSolvable(leap, game, pos - 1);    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); 
        while (q-- > 0) {
            int n = scanner.nextInt(); 
            int leap = scanner.nextInt(); 
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }
            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }

        scanner.close();
    }
                  }
