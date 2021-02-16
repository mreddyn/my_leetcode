import java.util.ArrayList;
import java.util.List;

public class AllPermutationsOfString {
    
    private static void fun(String candidate, String remaining, List<String>list){
        if (remaining.length() == 0) {
            list.add(candidate);
        }
 
        for (int i = 0; i < remaining.length(); i++)
        {
            String newCandidate = candidate + remaining.charAt(i);
 
            String newRemaining = remaining.substring(0, i) +
                                  remaining.substring(i + 1);
 
            fun(newCandidate, newRemaining,list);
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = "ABC";
        fun("", s, list);
        System.out.println(list);
    }
    
}
