public class Prob7 {
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
        Math.min(start,end);
        return max_sofar;


    }
}
