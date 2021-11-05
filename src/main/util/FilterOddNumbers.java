import java.util.*;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public static void main(String[] args) {
        // int[] nuInts = new int[]{14, 15, 177, 90099, 896789, 2, 3, 8, 90, 76, 5, 89, 89, 7, 3, 33, 11, 12, 1, 1};

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(15);
        numList.add(177);
        numList.add(90099);
        numList.add(896789);
        numList.add(2);
        numList.add(3);
        numList.add(8);
        numList.add(90);
        numList.add(76);
        numList.add(5);
        numList.add(89);
        numList.add(89);
        numList.add(7);
        numList.add(3);
        numList.add(33);
        numList.add(11);
        numList.add(12);
        numList.add(1);
        numList.add(1);
        List<Integer> tempList =numList.stream().filter(e-> e>55).collect(Collectors.toList());
        System.out.println("tempList = " + tempList);
        FilterOddNumbers filterOddNumbers = new FilterOddNumbers();
        Map<String, Integer> filteredMap = new HashMap<>();

        filteredMap = filterOddNumbers.filterNumbers(numList);
        System.out.println(filteredMap);


    }

    public Map filterNumbers(ArrayList<Integer> numberArray) {
        Map<String, Integer> oddMap = new HashMap<>();

        for (int value : numberArray) {
            if (value % 2 == 0) {
                System.out.println(value + " is even ");
            } else {
                if (oddMap.containsKey(String.valueOf(value))) {
                    oddMap.put(String.valueOf(value), oddMap.get(String.valueOf(value)) + 1);
                } else {
                    oddMap.put(String.valueOf(value), 1);
                }
            }
            System.out.println("value " + value);
        }

        return oddMap;
    }
}
