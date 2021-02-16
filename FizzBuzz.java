import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static List<String> fun(int n){
        List<String> res = new ArrayList<>();
        if(n < 1)
            return res;
        for(int i = 1, fizz = 3,buzz = 5;i<=n;i++){
            String temp = null;
            if(i == fizz && i == buzz){
                fizz = fizz+3;
                buzz = buzz+5;
                temp = "FizzBuzz";
            }
            else if(i == fizz){
                fizz = fizz+3;
                temp = "Fizz";
            }
            else if(i == buzz){
                buzz = buzz+5;
                temp =  "Buzz";
            }
            else{
                temp = String.valueOf(i);
            }
            res.add(temp);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fun(n));
    }
    
}
