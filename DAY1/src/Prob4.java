import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Prob4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = FindIntersection(nums1, nums2);
        System.out.println(Arrays.toString(result));


    }
    public static int[] FindIntersection(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> cnt=new HashMap<>();
        for (int num : arr1) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }
        List<Integer> intersect=new ArrayList<>();
        for (int num : arr2) {
            if (cnt.getOrDefault(num, 0) > 0) {
                intersect.add(num);
                cnt.put(num, cnt.get(num) - 1);
            }
        }
        int[] result = new int[intersect.size()];
        for (int i = 0; i < intersect.size(); i++) {
            result[i] = intersect.get(i);
        }
        return result;


    }
}
