import java.util.Arrays;

public class Prob5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        RotateArray(arr, k);
        System.out.println(Arrays.toString(arr));

    }
    public static void RotateArray(int[] array, int k){
        int n = array.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = array[i];
        }

        for (int i = 0; i < n; i++) {
            array[i] = rotated[i];
        }

    }
}
