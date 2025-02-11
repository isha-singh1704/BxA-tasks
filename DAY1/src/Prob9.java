import java.util.HashSet;

public class Prob9 {
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int maxlen=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }

        return maxlen;


    }
}
