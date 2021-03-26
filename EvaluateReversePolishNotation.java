import java.util.Stack;

public class EvaluateReversePolishNotation {
    private static int fun(String []tokens){
        Stack<Integer> st = new Stack<>();
        int n,a,b,res;
        n = tokens.length;
        for(int i=0;i<n;i++){
            System.out.println(st);
            
            if(tokens[i].length()==1 && (tokens[i].charAt(0)=='+' || tokens[i].charAt(0)=='-' || tokens[i].charAt(0)=='*' || tokens[i].charAt(0)=='/')){
                System.out.println(tokens[i].charAt(0));
                a = st.pop();
                 b = st.pop();
                if(tokens[i].charAt(0) == '+'){
                    res = a+b;
                    st.push(res);
                }
                else if(tokens[i].charAt(0) == '-'){
                    res = b-a;
                    st.push(res);
                }
                else if(tokens[i].charAt(0) == '*'){
                    res = a*b;
                    st.push(res);
                }
                else{
                    res = b/a;
                    st.push(res);
                }
                
            }
            else{
                int temp = Integer.parseInt(tokens[i]);
                st.push(temp);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String tokens[] = {"2", "1", "+", "3", "*"};
        System.out.println(fun(tokens));
    }
    
}
