import java.util.HashMap;

public class LongestSubStringwithoutRepeatingCharacters {
    private static int fun(String s){
        HashMap<Character,Integer>map = new HashMap<>();
        int startindex,res;
        res = 0;startindex = 0;
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                startindex = Math.max(startindex,map.get(ch[i])+1);
            }
            map.put(ch[i], i);
            res = Math.max(res,i-startindex+1);
        }
       return res;
    }
    public static void main(String[] args) {
        String s = "srujan";
        System.out.println(fun(s));
    }
    
}
