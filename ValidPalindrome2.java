public class ValidPalindrome2 {
    private static boolean fun(String s){
        int n;
        n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n;i++){
            sb.deleteCharAt(i);
            check(sb.toString());
        }
        return false;

    }
    private static boolean check(String s){
        char ch[] = s.toCharArray();
        int left,right;
        left = 0;right = ch.length-1;
        while(left<=right){
            if(ch[left]==ch[right]){
            left++;
            right--;
            }
            else
             return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
    
}
