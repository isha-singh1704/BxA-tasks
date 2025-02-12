import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob10 {
    public static void main(String[] args) {
        Prob10 prob10=new Prob10();
        int[] nums = {1, 2, 3, 4, 8, 16};
        System.out.println(prob10.largestDivisibleSubset(nums));
    }


        List<Integer> res;
        int[] mem;
        public List<Integer> largestDivisibleSubset(int[] nums) {
            Arrays.sort(nums);
            res = new ArrayList<>();

            mem = new int[nums.length];
            Arrays.fill(mem, -1);
            helper(nums, 0, new ArrayList<>(), 1);
            return res;
        }
        private void helper(int[] nums, int index, List<Integer> curr, int prev) {
            if(curr.size() > res.size()) {
                res = new ArrayList<>(curr);
            }

            for(int i=index; i<nums.length; i++) {
                if(curr.size() > mem[i] && nums[i]%prev == 0) {
                    mem[i] = curr.size();
                    curr.add(nums[i]);
                    helper(nums, i+1, curr, nums[i]);
                    curr.remove(curr.size()-1);
                }
            }
        }
    

}
