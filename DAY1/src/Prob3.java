public class Prob3 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Prob3 prob3 = new Prob3();
        prob3.moveZeroes(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }

    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                index++;
            }else if(index>0){
                //swap
                int temp=nums[i];
                nums[i]=0;
                nums[i-index]=temp;
            }
        }


    }

}
