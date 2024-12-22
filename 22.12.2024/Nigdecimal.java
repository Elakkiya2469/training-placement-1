import java.math.BigDecimal;
import java.util.*;

class Solution{

    public static void main(Stringargs){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Strings=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        Arrays.sort(s, 0, n, (String s1, String s2) -> {
            BigDecimal b1 = new BigDecimal(s1);
            BigDecimal b2 = new BigDecimal(s2);
            return b2.compareTo(b1); 
        });

       
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
