package test;

public class reverseString {
    public static void main(String[] args) {
        String s = "asdhsdlkjfagj";
        String res ="";
        for (int i = 0; i < s.length(); i++) {
            res = res+s.charAt(s.length()-i-1);
        }
        System.out.println(res);
        boolean asd = s.contains("asd");
    }
}
