import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    private static List<List<String>> fun(String []strs){
        int n;
        n = strs.length;
        if(n==0)
          return new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(fun(strs));
    }
    
}
