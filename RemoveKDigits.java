import java.util.Stack;

public class RemoveKDigits {
    private static String fun(String num,int k){
       int n;
       n = num.length();
       if(k == n)
         return "0";
       Stack<Character> st = new Stack<>();
       int i = 0;
       while(i<n){
           while(k>0 && !st.empty() && st.peek()>num.charAt(i)){
               k--;
               st.pop();
           }
           st.push(num.charAt(i));
           i++;
       }
       while(k>0){
           st.pop();
           k--;
       }
       StringBuilder sb = new StringBuilder();
       while(!st.empty()){
           sb.append(st.pop());
       }
       
       while(sb.length()>0 && sb.charAt(sb.length()-1)=='0')
            sb.deleteCharAt(sb.length()-1);
        
       

       return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String num = "4321";
        int k = 1;
        System.out.println(fun(num, k));
    }
    
}
