
public class VerifyingAnAlienDictionary {
    private static boolean fun(String []words, String order){
           int n = order.length();
           int a[] = new int[26];
           for(int i=0;i<n;i++){
               a[order.charAt(i)-'a'] = i;
           }
           n = words.length;
           for(int i=1;i<n;i++){
               if(compare(words[i], words[i-1], a)>0){
                   return false;
               }
           }
        return true;
    }
    private static int compare(String word1,String word2,int []a){
        int p,q;
               p = word1.length();
               q = word2.length();
               int min = Math.min(p,q);
               for(int j=0;j<min;j++){
                    int c1 = word1.charAt(j)-'a';
                    int c2 = word2.charAt(j)-'a';
                    if(c1 != c2){
                        return a[c1] - a[c2];
                    }
               }
               return p == min?-1:1;
    }
    public static void main(String[] args) {
        
    }
    
}
