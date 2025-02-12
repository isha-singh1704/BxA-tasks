public class Prob7 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Prob7 prob = new Prob7();
        System.out.println("Maximum contiguous sum: " + prob.maxSubArray(arr));

    }
    public int maxSubArray(int[] arr) {
        int start=0;
        int end=0;
        int maxEnd=arr[0];
        int max_sofar=arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnd += arr[i];
            if (arr[i]>maxEnd){
                maxEnd=arr[i];
                if (max_sofar<maxEnd){
                    start=i;
                }
            }
            if (max_sofar<maxEnd){
                max_sofar=maxEnd;
                end=i;
            }



        }
        return max_sofar;


    }
}
