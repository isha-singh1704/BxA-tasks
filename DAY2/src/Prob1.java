import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Prob1 {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map=new HashMap<>();
        for (String word:strs){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sortedStr=new String(arr);
            if (!map.containsKey(sortedStr)){
                map.put(sortedStr,new ArrayList<>());

            }
            map.get(sortedStr).add(word);
        }
        return new ArrayList<>(map.values());


    }
}
