public class ReverseArray {

    public static void main(String[] args) {
        int[] numInts = new int[]{14, 15, 177, 90099, 896789, 2, 3, 8, 90, 76, 5, 89, 7, 3, 33, 11, 12, 1};

        ReverseArray reverseArray = new ReverseArray();
        System.out.println("numberArray before reversal -- >");
        printArray(numInts, numInts.length);
        reverseArray.reverseArrayWithoutNewSpace(numInts);
    }

    public int[] reverseArrayWithoutNewSpace(int[] numberArray) {

        int start = 0;
        int end = numberArray.length - 1;
        int temp;


        System.out.println("Start -- >" + start);

        System.out.println("End -- >" + end);
        while (start < end) {
            temp = numberArray[start];
            numberArray[start] = numberArray[end];
            numberArray[end] = temp;
            start++;
            end--;
        }
        System.out.println("numberArray after reversal -- >");
        printArray(numberArray, numberArray.length);
        return numberArray;
    }

    static void printArray(int arr[],
                           int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
