import java.util.Arrays;

public class Prob6 {
    public static void main(String[] args) {
        Prob6 prob6=new Prob6();
        System.out.println(prob6.checkIfAnagram("abc", "cbaebabacd")); // true
    }
    public boolean checkIfAnagram(String t,String s){
        int m=s.length(),n=t.length();
        if (n>m) return false;

        int[] freqT=new int[26];
        int[] freqS=new int[26];

        for (char ch:t.toCharArray()){
            freqT[ch-'a']++;
        }
        for (int i=0;i<n;i++){
            freqS[s.charAt(i)-'a']++;
        }

        if (Arrays.equals(freqT,freqS)) return true;//first-window check

        for (int i = n; i < m; i++) {
            freqS[s.charAt(i)-'a']++;//addin new character
            freqS[s.charAt(i-n)-'a']--;// remove leftmost character

            if (Arrays.equals(freqT,freqS)) return true;
        }
        return false;


    }
}
