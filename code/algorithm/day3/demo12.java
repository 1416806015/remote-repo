package algorithm.day3;

public class demo12 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        int[] arr2 = copy(arr);
        printArr(arr2);
    }

    public static int[] copy(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.print("]");
    }
}
