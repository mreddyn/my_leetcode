import java.util.Stack;

public class MaxStack {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public MaxStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        if(st1.isEmpty()){
            st1.push(x);
            st2.push(x);
        }
        else{
            int temp = st2.peek();
            if(temp <= x){
                st2.push(x);
                st1.push(x);
            }
            else{
                st1.push(x);
            }
        }
    }
    
    public int pop() {
        int temp1 = st1.peek();
        int temp2 = st2.peek();
        int res;
        if(temp1 == temp2){
            st1.pop();
            res = st2.pop();
        }
        else{
            res = st1.pop();
        } 
        return res;
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int peekMax() {
        return st2.peek();
    }
    
    public int popMax() {
        if(!st1.empty()){
            st1.pop();
        }
        return st2.pop();
    }
    public static void main(String[] args) {
        
    }
    
}
