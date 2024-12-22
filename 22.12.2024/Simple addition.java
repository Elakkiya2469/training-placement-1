import java.io.*;
import java.util.*;

class Add{

    public void add(int... numbers) {
        int sum = 0;
        String separator = "";
        for (int number : numbers) {
            sum += number;
            System.out.print(separator + number);
            separator = "+";
        }
        System.out.println(" = " + sum);
    }
}

public class Solution{

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob1=new Add();
            ob1.add(n1,n2);
            ob1.add(n1,n2,n3);
            ob1.add(n1,n2,n3,n4); 
            ob1.add(n1,n2,n3,n4,n5); 
            ob1.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());
            }
            if(overload)
            {
                System.out.println("Overloading is
