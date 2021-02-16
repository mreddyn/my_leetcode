import java.util.Stack;

public class BasicCalculator {
    private static int fun(String s){
        int res,num,base;
        res = 0; num = 0; base = 1;
        s = reform(s);
        for(char c:s.toCharArray()){
            switch(c){
                case '+': res = res+num;
                        num = 0;
                        base = 1;
                        break;
                case '-': res = res-num;
                        num = 0;
                        base = 1;
                        break;
                default:num = num+(c-'0')*base;
                            base = base*10;

            }
        }
        return res;
    }
    private static String reform(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Boolean>st = new Stack<>();
        boolean add = true;
        st.push(add);
        for(char c:s.toCharArray()){
            switch(c){
                case ' ':break;
                case '(':st.push(add);
                         break;
                case ')':st.pop();
                         break;
                case '+':add = st.peek();
                         sb.append(st.peek()?'+':'-');
                         break;
                case '-':add = !st.peek();
                        sb.append(st.peek()?'-':'+');
                        break;
                default:sb.append(c);
            }
        }
        if(sb.charAt(0)!='+' || sb.charAt(0)!='-')
            sb.insert(0,'+');
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        
    }
    
}
