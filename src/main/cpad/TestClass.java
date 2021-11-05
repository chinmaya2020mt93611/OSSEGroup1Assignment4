import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestClass {

    public void removeDuplicatesFromArray(String[] nameArray) {
        List<String> noDuplicate;
       // noDuplicate= IntStream.of()Arrays.asList(nameArray));

        System.out.println("After removing duplicate using collection " );;

        Set<String> noDupSet = new LinkedHashSet<>(Arrays.asList(nameArray));
        //List<String> noDuplicate=;
        System.out.println("After removing duplicate using hashset = " + noDupSet);
    }

    public static void main(String[] args) {

        String names = "(\"Praveen\",\"Shruthi\",\"Prasanna\",\"Swamy\",\"Nirmala\",\"Prasanna\",\"Shilpa\",\"Praveen\")";
        String[] nameArrayString = names.split("\\s");
        ArrayList<String> wordArray = new ArrayList<>();
        wordArray.add("Praveen");
        wordArray.add("Shruthi");
        wordArray.add("Prasanna");
        wordArray.add("Swamy");
        wordArray.add("Nirmala");
        wordArray.add("Prasanna");
        wordArray.add("Shilpa");
        wordArray.add("Praveen");
        TestClass smTestClass = new TestClass();
        smTestClass.removeDuplicatesFromArray(nameArrayString);



        /*System.out.println("11<22<33 is " +(11<22<33));
        System.out.println(smTestClass.sample(1, 2));



    }

    public void display(Object o) {
        System.out.println("in obje}ct");
    }

    public void display(String o) {
        System.out.println("in strr");
    }

    public void display(StringBuffer sb) {
        System.out.println("in obstbbject");
    }
/*    public static int sample(int a, int b) {
        System.out.println("hiii");

        try {
            int ab = 100 / 0;
        } catch (Exception e) {
            return 100;
        } finally {
            System.out.println(1000);
        }
        return 0;
    }*/


    }
}