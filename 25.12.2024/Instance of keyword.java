import java.util.*;

class Student {}
class Rockstar {}
class Hacker {}

public class InstanceOFTutorial {

    static String count(ArrayList<Object> mylist) {
        int students = 0, rockstars = 0, hackers = 0;

        for (Object element : mylist) {
            if (element instanceof Student) {
                students++;
            } else if (element instanceof Rockstar) {
                rockstars++;
            } else if (element instanceof Hacker) {
                hackers++;
            }
        }

        return students + " " + rockstars + " " + hackers;
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) {
                mylist.add(new Student());
            } else if (s.equals("Rockstar")) {
                mylist.add(new Rockstar());
            } else if (s.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }

        System.out.println(count(mylist));
    }
}
