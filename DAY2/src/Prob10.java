import java.util.HashMap;

public class Prob10 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the ball flew far and away!";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        for(String word : banned) if(map.containsKey(word)) map.remove(word);
        String res = null;
        for(String word : map.keySet())
            if(res == null || map.get(word) > map.get(res))
                res = word;
        return res;
    }
}
