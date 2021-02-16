public class LongestPalindromicSubString {
    private static String fun(String s){
        int n,odd,even,res,start,end;
        n  = s.length();
        start = 0;end = 0;
        for(int i=0;i<n;i++){
             odd = check(s,i,i);
             even = check(s,i,i+1);
             res = Math.max(odd,even);
             if(res > end - start){
                 start = i - (res-1)/2;
                 end = i+(res/2);
             }
            
        }

        return s.substring(start, end+1);
    }
    private static int check(String s,int left,int right){
        int n = s.length();
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(fun(s));
    }
    
}
