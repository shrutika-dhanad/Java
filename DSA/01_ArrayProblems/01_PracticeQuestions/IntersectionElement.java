
public class IntersectionElement {

    static int intersectionEle(int arr1[], int arr2[]) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i] + " ");
                    break;

                    

                }
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 6, 5, 4 };
        int arr2[] = { 9, 8, 7, 4, 5, 6 };

        System.out.println(intersectionEle(arr1, arr2));
    }
}
