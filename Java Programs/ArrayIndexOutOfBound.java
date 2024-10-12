public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        try {
            int arr[]=new int[5];
            arr[6]=9;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
}
