public class ArraysPra {
    public static void main(String[] args) {

        int maxPrice[] = { 1, 200, 600, 8000, 1, 2, 3, 4 };
        int maxiValue = maxPrice[0];
        int len = maxPrice.length;
        for (int i = 0; i <= len - 1; i++) {
            if (maxPrice[i] > maxiValue) {
                maxiValue = maxPrice[i];
            }
        }
        System.out.println(maxiValue);

        // min elememnt .

        int arr[] = { 2, 5, 8, 4, -3, -1, 8, 0 };
        int min = arr[0];
        int length=arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
