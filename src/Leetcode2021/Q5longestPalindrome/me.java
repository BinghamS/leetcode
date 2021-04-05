package Q5longestPalindrome;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/15 15:13
 * @Version 1.0
 **/
public class me {
    public String longestPalindrome(String s) {
        String res = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            String longestStr = getLongestStr(s, i, i + 1);
            String longestStr1 = getLongestStr(s, i, i);
            if(longestStr.length()>longestStr1.length()){
                if(longestStr.length() > max){
                    res = longestStr;
                    max = longestStr.length();
                }
            }else{
                if(longestStr1.length() > max){
                    res = longestStr1;
                    max = longestStr1.length();
                }
            }

        }
        return res;
    }

    public static String getLongestStr(String s,int left,int right){
        int max = 0;
        int count = 0;
        String res = "";
        //String str = s.substring(left, right);
        while(left>=0 && right<=s.length()){
            String str = s.substring(left, right);
            if (isPalindromic(str)) {
                count = str.length();
                if (count > max){
                    res = str;
                    max = count;
                }
                left--;
                right++;

            }else{
                break;
            }
        }
        return res;
    }

    public static Boolean isPalindromic(String s){
        char[] chars = s.toCharArray();
        String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        if (reverse.equals(s)){
            return true;
        }else return false;
    }

}
