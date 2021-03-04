public class ValidPalindrome2Meth_2 {
    private static boolean fun(String s){
        int n;
        n = s.length();
        int left,right;
        left = 0; right = n-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                char leftchar = s.charAt(left);
                char rightchar = s.charAt(right);
                StringBuilder sb = new StringBuilder(s);
                if(check(sb.deleteCharAt(left).toString())) return true;
                else{
                    sb.insert(left, leftchar);
                    if(check(sb.deleteCharAt(right).toString())) return true;
                    else return false;
                }
                 
            }
            left++;
            right--;
        }
        return true;
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
