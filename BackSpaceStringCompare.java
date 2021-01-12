package JavaPrograms;

public class BackSpaceStringCompare {
    private static String fun(String s){
          int n,count;
          String res = "";
           n = s.length();count=0;
           for(int i=n-1;i>=0;i--){
               if(s.charAt(i)=='#'){
                   count++;
               }
               else{
                   if(count>0)
                     count--;
                   else{
                     res = res+s.charAt(i);
                   }
                    
               }
           }
           
           System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        String S="a#c";
        String T="b";
        String temp1 = fun(S);
        String temp2 = fun(T);
        System.out.println((temp1.equals(temp2)));
    }
    
}
